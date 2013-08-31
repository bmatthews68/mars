package com.btmatthews.mars.core.service.impl;

import com.btmatthews.atlas.core.common.Paging;
import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.atlas.core.id.IdentifierGenerator;
import com.btmatthews.mars.core.dao.LayoutDAO;
import com.btmatthews.mars.core.domain.LayoutDescriptor;
import com.btmatthews.mars.core.domain.LayoutDescriptorBuilder;
import com.btmatthews.mars.core.domain.LayoutDescriptorBuilderFactory;
import com.btmatthews.mars.core.service.LayoutService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
@Service
public class LayoutServiceImpl implements LayoutService {

    private static final String[] GRID_BAG_PLACEHOLDER_SUFFIXES = {"north", "east", "centre", "west", "south"};
    private LayoutDAO layoutDao;
    private LayoutDescriptorBuilderFactory layoutDescriptorBuilderFactory;
    private IdentifierGenerator<String> identifierGenerator;

    public LayoutServiceImpl(final LayoutDAO dao, final LayoutDescriptorBuilderFactory builderFactory, final IdentifierGenerator<String> generator) {
        layoutDao = dao;
        layoutDescriptorBuilderFactory = builderFactory;
        identifierGenerator = generator;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public long countLayouts() {
        return layoutDao.count();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<LayoutDescriptor> listLayouts(final Paging paging) {
        return layoutDao.find(paging);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public LayoutDescriptor createGridLayout(
            @Min(value = 1) final int rows,
            @Min(value = 1) final int columns,
            @NotNull final String key,
            @NotNull final Localized<String> name) {
        final LayoutDescriptorBuilder builder = layoutDescriptorBuilderFactory.newInstance();
        final String id = identifierGenerator.generate();
        builder.setId(id);
        builder.setKey(key);
        builder.setName(name);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                final String placeholderId = identifierGenerator.generate();
                final String placeholderKey = new StringBuilder(key).append('_').append(row).append('_').append(column).toString();
                builder.addPlaceholder(placeholderId, placeholderKey);
            }
        }
        final LayoutDescriptor layoutDescriptor = builder.build();
        layoutDao.create(layoutDescriptor);
        return layoutDescriptor;
    }

    @Override
    public LayoutDescriptor createGridBagLayout(String key, Localized<String> name) {
        final LayoutDescriptorBuilder builder = layoutDescriptorBuilderFactory.newInstance();
        final String id = identifierGenerator.generate();
        builder.setId(id);
        builder.setKey(key);
        builder.setName(name);
        for (final String placeholderSuffix : GRID_BAG_PLACEHOLDER_SUFFIXES) {
            final String placeholderId = identifierGenerator.generate();
            final String placeholderKey = new StringBuilder(key).append('_').append(placeholderSuffix).toString();
            builder.addPlaceholder(placeholderId, placeholderKey);
        }
        final LayoutDescriptor layoutDescriptor = builder.build();
        layoutDao.create(layoutDescriptor);
        return layoutDescriptor;
    }

    @Override
    public LayoutDescriptor lookupLayoutById(String id) {
        return null;
    }

    @Override
    public LayoutDescriptor lookupLayoutByKey(String key) {
        return null;
    }

    @Override
    public void deleteLayout(LayoutDescriptor layout) {

    }
}

package com.btmatthews.mars.core.domain.impl;

import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.mars.core.domain.LayoutDescriptor;
import com.btmatthews.mars.core.domain.PlaceholderDescriptor;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public abstract class AbstractLayoutDescriptor implements LayoutDescriptor {

    private String id;
    private String key;
    private List<PlaceholderDescriptor> placeholders;
    private Localized<String> name;
    private Localized<String> description;

    protected AbstractLayoutDescriptor(final String id, final String key, final List<PlaceholderDescriptor> placeholders, final Localized<String> name, final Localized<String> description) {
        this.id = id;
        this.key = key;
        final ImmutableList.Builder<PlaceholderDescriptor> builder = ImmutableList.builder();
        this.placeholders = builder.addAll(placeholders).build();
        this.name = name;
        this.description = description;
    }

    @Override
    public final String getId() {
        return id;
    }

    @Override
    public final String getKey() {
        return key;
    }

    @Override
    public final List<PlaceholderDescriptor> getPlaceholderDescriptors() {
        return placeholders;
    }

    @Override
    public final Localized<String> getName() {
        return name;
    }

    @Override
    public final Localized<String> getDescription() {
        return description;
    }
}


package com.btmatthews.mars.core.domain.impl;

import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.mars.core.domain.LayoutDescriptor;
import com.btmatthews.mars.core.domain.LayoutDescriptorBuilder;
import com.btmatthews.mars.core.domain.PlaceholderDescriptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public abstract class AbstractLayoutDescriptorBuilder implements LayoutDescriptorBuilder {

    private String id;
    private String key;
    private List<PlaceholderDescriptor> placeholders = new ArrayList<PlaceholderDescriptor>();
    private Localized<String> name;

    protected AbstractLayoutDescriptorBuilder() {
    }

    protected AbstractLayoutDescriptorBuilder(final LayoutDescriptor layoutDescriptor) {
        id = layoutDescriptor.getId();
        key = layoutDescriptor.getKey();
        placeholders.addAll(layoutDescriptor.getPlaceholderDescriptors());
        name = layoutDescriptor.getName();
    }

    protected final String getId() {
        return id;
    }

    protected final String getKey() {
        return key;
    }

    protected final List<PlaceholderDescriptor> getPlaceholders() {
        return placeholders;
    }

    protected final Localized<String> getName() {
        return name;
    }

    @Override
    public final LayoutDescriptorBuilder setId(final String id) {
        this.id = id;
        return this;
    }

    @Override
    public final LayoutDescriptorBuilder setKey(final String key) {
        this.key = key;
        return this;
    }

    @Override
    public final LayoutDescriptorBuilder addPlaceholder(final String id, final String key) {

        return this;
    }

    @Override
    public final LayoutDescriptorBuilder setName(final Localized<String> name) {
        this.name = name;
        return this;
    }
}

package com.btmatthews.mars.core.domain;

import com.btmatthews.atlas.core.domain.i18n.Localized;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public interface LayoutDescriptorBuilder {

    LayoutDescriptorBuilder setId(String id);

    LayoutDescriptorBuilder setKey(String key);

    LayoutDescriptorBuilder setName(Localized<String> name);

    LayoutDescriptorBuilder addPlaceholder(String id, String key);

    LayoutDescriptor build();
}

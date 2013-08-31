package com.btmatthews.mars.core.domain.impl;

import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.mars.core.domain.BorderLayoutDescriptor;
import com.btmatthews.mars.core.domain.PlaceholderDescriptor;

import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public final class BorderLayoutDescriptorImpl extends AbstractLayoutDescriptor implements BorderLayoutDescriptor {

    public BorderLayoutDescriptorImpl(final String id, final String key, final List<PlaceholderDescriptor> placeholders,
                                      final Localized<String> name, final Localized<String> description) {
        super(id, key, placeholders, name, description);
    }
}

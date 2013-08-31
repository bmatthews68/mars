package com.btmatthews.mars.core.domain.impl;

import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.mars.core.domain.FlowLayoutDescriptor;
import com.btmatthews.mars.core.domain.PlaceholderDescriptor;

import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public final class FlowLayoutDescriptorImpl extends AbstractLayoutDescriptor implements FlowLayoutDescriptor {

    private Orientation orientation;

    public FlowLayoutDescriptorImpl(final String id, final String key, final List<PlaceholderDescriptor> placeholders,
                                    final Localized<String> name, final Localized<String> description,
                                    final Orientation orientation) {
        super(id, key, placeholders, name, description);
        this.orientation = orientation;
    }

    @Override
    public Orientation getOrientation() {
        return orientation;
    }
}

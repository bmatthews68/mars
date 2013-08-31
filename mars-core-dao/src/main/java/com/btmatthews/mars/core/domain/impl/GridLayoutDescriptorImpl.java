package com.btmatthews.mars.core.domain.impl;

import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.mars.core.domain.GridLayoutDescriptor;
import com.btmatthews.mars.core.domain.PlaceholderDescriptor;

import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public final class GridLayoutDescriptorImpl extends AbstractLayoutDescriptor implements GridLayoutDescriptor {
    private int rows;
    private int columns;

    public GridLayoutDescriptorImpl(final String id, final String key, final List<PlaceholderDescriptor> placeholders,
                                    final Localized<String> name, final Localized<String> description, final int rows,
                                    final int columns) {
        super(id, key, placeholders, name, description);
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public int getColumns() {
        return columns;
    }
}

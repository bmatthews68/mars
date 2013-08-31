package com.btmatthews.mars.core.domain;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public interface GridLayoutDescriptorBuilder extends LayoutDescriptorBuilder<GridLayoutDescriptorBuilder, GridLayoutDescriptor> {

    GridLayoutDescriptorBuilder setRows(int rows);

    GridLayoutDescriptorBuilder setColumns(int columns);
}

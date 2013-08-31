package com.btmatthews.mars.core.domain;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public interface LayoutDescriptorBuilderFactory {

    FlowLayoutDescriptorBuilder newFlowLayoutDescriptorBuilder();

    BorderLayoutDescriptorBuilder newBorderLayoutDescriptorBuilder();

    GridLayoutDescriptorBuilder newGridLayoutDescriptorBuilder();

    FlowLayoutDescriptorBuilder cloneLayoutDescriptorBuilder(FlowLayoutDescriptor layout);

    BorderLayoutDescriptorBuilder cloneLayoutDescriptorBuilder(BorderLayoutDescriptor layout);

    GridLayoutDescriptorBuilder cloneLayoutDescriptorBuilder(GridLayoutDescriptor layout);
}

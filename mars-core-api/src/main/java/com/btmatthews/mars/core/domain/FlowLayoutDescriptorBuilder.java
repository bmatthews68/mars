package com.btmatthews.mars.core.domain;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public interface FlowLayoutDescriptorBuilder extends LayoutDescriptorBuilder<FlowLayoutDescriptorBuilder, FlowLayoutDescriptor> {

    FlowLayoutDescriptorBuilder setOrientation(FlowLayoutDescriptor.Orientation orientation);
}

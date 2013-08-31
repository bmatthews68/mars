package com.btmatthews.mars.core.domain;

import com.btmatthews.atlas.core.domain.i18n.Localized;

import java.util.List;

/**
 * Created by bmatthews68 on 10/06/2013.
 */
public interface PageDescriptor {

    String getId();

    Localized<String> getName();

    LayoutDescriptor getLayoutDescriptor();

    List<PlaceholderDescriptor> getPlaceholderDescriptors();
}

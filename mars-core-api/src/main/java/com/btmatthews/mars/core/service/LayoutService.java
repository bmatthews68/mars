package com.btmatthews.mars.core.service;

import com.btmatthews.atlas.core.common.Paging;
import com.btmatthews.atlas.core.domain.i18n.Localized;
import com.btmatthews.mars.core.domain.FlowLayoutDescriptor;
import com.btmatthews.mars.core.domain.LayoutDescriptor;

import java.util.List;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
public interface LayoutService {

    long countLayouts();

    List<LayoutDescriptor> listLayouts(Paging paging);

    LayoutDescriptor createFlowLayout(FlowLayoutDescriptor.Orientation orientation, String key, Localized<String> name);

    LayoutDescriptor createGridLayout(int rows, int columns, String key, Localized<String> name);

    LayoutDescriptor createGridBorderLayout(String key, Localized<String> name);

    LayoutDescriptor lookupLayoutById(String id);

    LayoutDescriptor lookupLayoutByKey(String key);

    void deleteLayout(LayoutDescriptor layout);
}

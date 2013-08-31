package com.btmatthews.mars.core.domain;

import com.btmatthews.atlas.core.domain.i18n.Localized;

import java.util.Map;

/**
 * Created by bmatthews68 on 10/06/2013.
 */
public interface PortletDescriptor {

    String getId();

    Localized<String> getName();

    Map<String, Object> getConfiguration();
}

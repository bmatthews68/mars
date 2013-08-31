package com.btmatthews.mars.core.domain;

import java.util.Map;

/**
 * Created by bmatthews68 on 10/06/2013.
 */
public interface PlaceholderDescriptor {

    String getKey();

    Map<String, Object> getConfiguration();
}

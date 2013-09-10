package org.jmlspecs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
public @interface JmlFeatureGroup {
    String groupName();
}

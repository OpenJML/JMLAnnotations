package org.jmlspecs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@JmlFeatureGroup(groupName="flowspecs")
@Target({ ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.METHOD })
public @interface Level {
    public static final String DEFAULT = "__JML_LEVEL_INTERNAL_DEFAULT";
    //@ Note that NO application of this annotation should have a blank level (or channel)
    String value() default DEFAULT;

}

package org.jmlspecs.annotation;

import java.lang.annotation.Documented;

@Documented

public @interface Level {
    public static final String DEFAULT = "__JML_LEVEL_INTERNAL_DEFAULT";
    //@ Note that NO application of this annotation should have a blank level (or channel)
    String value() default DEFAULT;

}

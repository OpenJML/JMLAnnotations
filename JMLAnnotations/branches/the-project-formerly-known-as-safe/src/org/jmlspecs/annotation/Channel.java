package org.jmlspecs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
public @interface Channel {
    public static final String DEFAULT = "__JML_CHANNEL_INTERNAL_DEFAULT";
    //@ Note that NO application of this annotation should have a blank level (or channel)
    String value() default DEFAULT;

}

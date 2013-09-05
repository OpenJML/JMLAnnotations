package org.jmlspecs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD })
public @interface Channel {
    public static final String DEFAULT = "__JML_CHANNEL_INTERNAL_DEFAULT";
    //@ Note that NO application of this annotation should have a blank level (or channel)
    String value() default DEFAULT;

}

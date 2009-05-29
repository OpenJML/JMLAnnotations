package org.jmlspecs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated
/** Use ModelField or ModelMethod instead. */
public @interface Model {
	String value() default "";
}

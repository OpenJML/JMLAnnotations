package org.jmlspecs.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SignalsOnly {

	boolean redundantly() default false;
	String value();

}


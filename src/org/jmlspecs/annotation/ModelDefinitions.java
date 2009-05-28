package org.jmlspecs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ModelDefinitions {
  Model[] value() default {};
  ModelField[] fields() default {};
  ModelMethod[] methods() default {};
}

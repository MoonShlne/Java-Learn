package com.myself11.annotation.juint;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/20 17:07
 */
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
@Retention(RetentionPolicy.SOURCE)

public @interface MyAnnotation {
String value() default  "aa";

}

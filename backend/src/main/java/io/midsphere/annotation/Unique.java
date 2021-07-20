package io.midsphere.annotation;

import java.lang.annotation.*;

/**
 * Markable Annotation
 * @author liqiwen
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Unique {
}

package com.lzh.code.annotation;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)

@Documented()
@Target(value = ElementType.ANNOTATION_TYPE)
public @interface A_Repeatable {
    A[] value();
}

package org.elf.framework.core.annotation;

import java.lang.annotation.ElementType;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ElementType.TYPE})
public @interface ContentView {

    int value();
}
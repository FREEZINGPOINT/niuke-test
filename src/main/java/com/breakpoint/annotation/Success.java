package com.breakpoint.annotation;

import java.lang.annotation.*;

/**
 * 执行成功
 *
 * @author :breakpoint/赵立刚
 * create on 2020/07/10
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Success {
}

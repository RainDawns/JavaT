package com.Day13.Annortation1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 23:50<br/>
 *
 * @author lnh<br />
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface id {
    int id();
}

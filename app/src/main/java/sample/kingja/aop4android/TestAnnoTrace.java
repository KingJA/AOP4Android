package sample.kingja.aop4android;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description:TODO
 * Create Time:2018/3/10 15:30
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnoTrace {
    String value();

    int type();
}

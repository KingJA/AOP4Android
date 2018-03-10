package sample.kingja.aop4android;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Description:TODO
 * Create Time:2018/3/10 15:28
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Aspect
public class TestAnnoAspect {
    //execution(<修饰符模式>? <返回类型模式> <方法名模式>(<参数模式>) <异常模式>?)
    //@Pointcut主要用于切入点的复用
//    @Pointcut("execution(@sample.kingja.aop4android.TestAnnoTrace * *(..))")
//    public void pointcut() {
//        System.out.println("@Pointcut");
//    }
    @Pointcut("execution(@sample.kingja.aop4android.TestAnnoTrace * *(..))")
    public void pointcut() {

    }


    @Before("pointcut()")
    public void before(JoinPoint point) {
        System.out.println("@Before");
    }

    @After("pointcut()")
    public void after(JoinPoint point) {
        System.out.println("@After");
    }


//    @Around("pointcut()")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("around前");
//        joinPoint.proceed();
//        System.out.println("around后");
//    }

//    @Around("pointcut()")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("@Around");
////        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
////        String name = signature.getName(); // 方法名：test
////        Method method = signature.getMethod(); // 方法：public void com.lqr.androidaopdemo.MainActivity.test(android.view.View)
////        Class returnType = signature.getReturnType(); // 返回值类型：void
////        Class declaringType = signature.getDeclaringType(); // 方法所在类名：MainActivity
////        String[] parameterNames = signature.getParameterNames(); // 参数名：view
////        Class[] parameterTypes = signature.getParameterTypes(); // 参数类型：View
//
////        TestAnnoTrace annotation = method.getAnnotation(TestAnnoTrace.class);
////        String value = annotation.value();
////        int type = annotation.type();
//
////        long beginTime = SystemClock.currentThreadTimeMillis();
//        joinPoint.proceed();
////        long endTime = SystemClock.currentThreadTimeMillis();
////        long dx = endTime - beginTime;
////        System.out.println("耗时：" + dx + "ms");
//    }


    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint point, Object returnValue) {
        System.out.println("@AfterReturning");
    }

    @AfterThrowing(value = "pointcut()", throwing = "ex")
    public void afterThrowing(Throwable ex) {
        System.out.println("@afterThrowing");
        System.out.println("ex = " + ex.getMessage());
    }

//    @AfterThrowing(value = "pointcut()", throwing = "ex")
//    public void afterThrowing(Throwable ex) {
//        System.out.println("@afterThrowing");
//        System.out.println("ex = " + ex.getMessage());
//    }
}

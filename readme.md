2、AOP注解与使用

@Aspect：声明切面，标记类
@Pointcut(切点表达式)：定义切点，标记方法
@Before(切点表达式)：前置通知，切点之前执行
@Around(切点表达式)：环绕通知，切点前后执行
@After(切点表达式)：后置通知，切点之后执行
@AfterReturning(切点表达式)：返回通知，切点方法返回结果之后执行
@AfterThrowing(切点表达式)：异常通知，切点抛出异常时执行
@Pointcut、@Before、@Around、@After、@AfterReturning、@AfterThrowing需要在切面类中使用，即在使用@Aspect的类中。
package com.xiaoleng.aop.service.aop;


import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {


    /**
     * 定义一个切入点
     */
    @Pointcut("execution" +
            "(public java.math.BigDecimal com.xiaoleng.aop.service.CalculatorServiceImpl.div(..))")
    public void pointCut() {

    }


    @Before("pointCut()")
    public void calculateStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("除法运行开始之前.....参数列表:" + JSON.toJSONString(args));

    }

    @After("pointCut()")
    public void calculateEnd(JoinPoint joinPoint) {
        System.out.println("除法运行完成.....");

    }

    @AfterReturning(returning = "result", pointcut = "pointCut()")
    public void calculateReturn(JoinPoint joinPoint, Object result) {
        System.out.println("除法正常返回.....运行结果是:" + JSON.toJSONString(result));

    }

    @AfterThrowing("pointCut()")
    public void calculateThrowException() {
        System.out.println("除法运行异常.....");
    }


    @Around(value = "pointCut()")
    public Object calculateAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("around 开始，参数:" + JSON.toJSONString(args));
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("around 结束,返回值是:" + JSON.toJSONString(proceed));
        return proceed;
    }

}

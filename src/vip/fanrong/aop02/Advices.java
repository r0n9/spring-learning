/**
 * Copyright Nielsen. All Rights Reserved. This software is the proprietary information of Nielsen.
 * Use is subject to license terms.
 */
package vip.fanrong.aop02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author fangro01
 *
 */
@Component
@Aspect
public class Advices {
    @Around("@annotation(vip.fanrong.aop02.Timer)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("----------环绕前置----------");
        System.out.println("环绕" + pjp.getSignature().getName());
        long time = System.currentTimeMillis();
        Object result = pjp.proceed();
        time = System.currentTimeMillis() - time;

        System.out.println("----------环绕后置---------- cost: " + time + " ms");
        return result;
    }
}

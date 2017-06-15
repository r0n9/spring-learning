/**
 * Copyright Nielsen. All Rights Reserved. This software is the proprietary information of Nielsen.
 * Use is subject to license terms.
 */
package vip.fanrong.aop03;

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
    @Around("@annotation(vip.fanrong.aop03.Timer)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("----------AROUND BEFORE----------");
        System.out.println("AROUND - " + pjp.getSignature().getName());
        long time = System.currentTimeMillis();
        Object result = pjp.proceed();
        time = System.currentTimeMillis() - time;

        System.out.println("----------AROUND AFTER---------- Cost: " + time + " ms");
        return result;
    }
}

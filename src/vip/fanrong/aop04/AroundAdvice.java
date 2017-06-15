package vip.fanrong.aop04;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("----------AROUND BEFORE----------");
        System.out.println("AROUND - " + method.getName());
        long time = System.currentTimeMillis();

        // 执行目标方法，并保存目标方法执行后的返回值
        Object rvt = proxy.invokeSuper(target, args);

        time = System.currentTimeMillis() - time;
        System.out.println("----------AROUND AFTER---------- Cost: " + time + " ms");

        return rvt;
    }

}

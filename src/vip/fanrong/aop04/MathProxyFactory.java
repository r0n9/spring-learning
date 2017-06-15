package vip.fanrong.aop04;

import org.springframework.cglib.proxy.Enhancer;

public class MathProxyFactory {
    public static Math getAuthInstance() {
        Enhancer en = new Enhancer();
        // 设置要代理的目标类
        en.setSuperclass(Math.class);
        // 设置要代理的拦截器
        en.setCallback(new AroundAdvice());
        // 生成代理类的实例 
        return (Math) en.create();
    }
}

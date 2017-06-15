package vip.fanrong.aop01;

import org.aspectj.lang.JoinPoint;

/**
 * 通知类，横切逻辑
 *
 */
public class Advices {

    private long time;


    public void before(JoinPoint jp) {
        time = System.currentTimeMillis();
        System.out.println("----------前置通知---------- ");
        System.out.println(jp.getSignature().getName());

        System.out.println(this.toString());


    }

    public void after(JoinPoint jp) {
        time = System.currentTimeMillis() - time;
        System.out.println("----------最终通知---------- cost: " + time + " ms");
    }
}

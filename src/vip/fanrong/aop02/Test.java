package vip.fanrong.aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("vip/fanrong/aop02/aop02.xml");

        Math math = ctx.getBean("math", Math.class);

        try {
            math.sub(10, 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

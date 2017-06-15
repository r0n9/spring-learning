package vip.fanrong.aop03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Test {

    @Autowired
    private Math math;

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationCfg.class);

        Test test = ctx.getBean(Test.class);
        test.math.sub(10, 6);

    }
}

package vip.fanrong.aop02;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("math")
public class Math {

    //加
    public int add(int n1, int n2) throws InterruptedException {
        int result = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + result);

        Thread.sleep(1000);

        return result;
    }

    //减
    @Timer
    public int sub(int n1, int n2) throws InterruptedException {
        int result = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + result);

        Thread.sleep(2000);

        return result;
    }

    //乘
    public int mut(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(n1 + "X" + n2 + "=" + result);
        return result;
    }

    //除
    public int div(int n1, int n2) {
        int result = n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + result);
        return result;
    }

}

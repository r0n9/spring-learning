package vip.fanrong.aop03;

import org.springframework.stereotype.Component;

@Component("math")
public class Math {

    public Math() {
        super();
    }

    //加
    @Timer
    public int add(int n1, int n2) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + result);

        return result;
    }

    //减
    @Timer
    public int sub(int n1, int n2) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + result);
        return result;
    }

    //乘
    @Timer
    public int mut(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(n1 + "X" + n2 + "=" + result);
        return result;
    }

    //除
    @Timer
    public int div(int n1, int n2) {
        int result = n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + result);
        return result;
    }

}

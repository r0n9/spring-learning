package vip.fanrong.aop04;

public class Test {
    public static void main(String[] args) {
        Math math = MathProxyFactory.getAuthInstance();
        System.out.println(math.add(23, 10));
        System.out.println(math.mut(213, 3265));
    }
}

package javase.operators;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class BasicArithmeticOperators {
    /**
     * main 方法执行结果：
     *
     * x + y = 27
     * x - y = 17
     * x * y = 110
     * x / y = 4
     * x % y = 2
     */
    public static void main(String[] args) {
        int x = 22;
        int y = 5;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        // 整数相除会舍去小数位
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}

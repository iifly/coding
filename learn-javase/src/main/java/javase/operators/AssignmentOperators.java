package javase.operators;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class AssignmentOperators {
    /**
     * main 方法执行结果：
     *
     * n = 10 -> n : 10
     * n += 1 -> n : 11
     * n -= 2 -> n : 9
     * n *= 3 -> n : 27
     * n /= 4 -> n : 6
     * n %= 5 -> n : 1
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println("n = 10 -> n : " + n);
        n += 1;
        System.out.println("n += 1 -> n : " + n);
        n -= 2;
        System.out.println("n -= 2 -> n : " + n);
        n *= 3;
        System.out.println("n *= 3 -> n : " + n);
        n /= 4;
        // 整数相除会舍去小数位
        System.out.println("n /= 4 -> n : " + n);
        n %= 5;
        System.out.println("n %= 5 -> n : " + n);

    }
}

package javase.operators;


/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class AutoIncrementAndAutoDecrementOperators {
    /**
     * main 方法执行结果：
     *
     * n++ 先使用 n 原先的值：1
     * 然后执行 +1 运算后 n 的值：2
     * #####################
     * --n 先执行 -1 运算，使用的是运算后 n 的值：1
     */
    public static void main(String[] args) {
        int n = 1;
        System.out.println("n++ 先使用 n 原先的值：" + n++);
        System.out.println("然后执行 +1 运算后 n 的值：" + n);
        System.out.println("#####################");
        System.out.println("--n 先执行 -1 运算，使用的是运算后 n 的值：" + --n);
    }
}

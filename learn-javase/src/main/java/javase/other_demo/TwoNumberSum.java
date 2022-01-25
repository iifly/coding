package javase.other_demo;

/**
 * @author zh-hq
 * @Description 两数之和
 * @date 2022/1/18
 */
public class TwoNumberSum {
    /**
     * 程序输出结果：
     *
     * 1 + 3 = 4
     * 和为：4
     */
    public static void main(String[] args) {
        int sum = twoIntSum(1, 3);
        System.out.println("和为：" + sum);
    }

    public static int twoIntSum(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
}

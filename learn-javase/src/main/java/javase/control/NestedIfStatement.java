package javase.control;

import java.util.Scanner;

/**
 * @author zh-hq
 * @Description if 语句 demo
 * @date 2022/1/29
 */
public class NestedIfStatement {
    /**
     *
     * 输入：4
     * main 方法执行结果：
     *
     * 请输入数字：4
     * 4是正数！
     * 4还是偶数！
     * 程序结束
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int inputInt = scanner.nextInt();
        if (inputInt > 0) {
            System.out.println(inputInt + "是正数！");
            if (inputInt % 2 == 0) {
                System.out.println(inputInt + "还是偶数！");
            }
        }
        scanner.close();
        System.out.println("程序结束");
    }
}

package javase.control;

import java.util.Scanner;

/**
 * @author zh-hq
 * @Description if 语句 demo
 * @date 2022/1/29
 */
public class IfElseStatement {
    /**
     *
     * 输入：5
     * main 方法执行结果：
     *
     * 请输入数字：5
     * 5是奇数！
     * 程序结束
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int inputInt = scanner.nextInt();
        if (inputInt % 2 == 0) {
            System.out.println(inputInt + "是偶数！");
        }else {
            System.out.println(inputInt + "是奇数！");
        }
        scanner.close();
        System.out.println("程序结束");
    }
}

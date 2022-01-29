package javase.operators;

import java.util.Scanner;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class TernaryOperator {
    /**
     * main 方法输出结果：
     *
     * 请输入数字：9
     * 9是:奇数
     * 程序结束
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int inputInt = scanner.nextInt();
        String result = inputInt % 2 == 0 ? "偶数" : "奇数";
        System.out.println(inputInt + "是:" + result);
        scanner.close();
        System.out.println("程序结束");
    }
}

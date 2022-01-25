package javase.other_demo;

import java.util.Scanner;

/**
 * @author zh-hq
 * @Description 接收用户输入 other_demo
 * @date 2022/1/18
 */
public class ReceiveUserInput {

    /**
     * 程序输入：
     * hello everyone!
     *
     * 程序输出结果：
     *
     * 请输入内容：
     * hello everyone!
     * 用户输入的内容是：hello everyone!
     */
    public static void main(String[] args) {
        // 创建一个用于读取用户输入的 Scanner 对象 scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");

        // 接收用户输入并赋值给 input 变量
        String input = scanner.nextLine();

        // 关闭 scanner
        scanner.close();

        // 打印用户输入的内容
        System.out.println("用户输入的内容是：" + input);
    }
}

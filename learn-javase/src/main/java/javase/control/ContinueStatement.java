package javase.control;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/7
 */
public class ContinueStatement {
    /**
     * main 方法执行结果：
     *
     * i = 2
     * i = 4
     * i = 6
     * i = 8
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                // 如果 i 不是偶数则进直接入下次循环
                continue;
            }
            // 如果 i 是偶数则会执行到以下代码
            System.out.println("i = " + i);
        }
    }
}


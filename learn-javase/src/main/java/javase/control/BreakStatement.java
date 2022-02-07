package javase.control;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/7
 */
public class BreakStatement {
    /**
     * main 方法执行结果：
     *
     * arr[0] = 1[不是偶数]
     * arr[1] = 3[不是偶数]
     * arr[2] = 6[找到第一个偶数]
     */
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("arr[" + i + "] = " + arr[i] + "[找到第一个偶数]");
                // 找到第一个偶数 结束循环
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i] + "[不是偶数]");
        }
    }
}

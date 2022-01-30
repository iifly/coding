package javase.control;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/30
 */
public class ForLoop {


    public static void main(String[] args) {
        // simple();
        // infinite();
        // arrayFor();
        arrayEnhancedFor();
    }

    /**
     * 用 main 方法调用执行结果：
     *
     * i = 0
     * i = 1
     * i = 2
     * i = 3
     * i = 4
     */
    public static void simple(){
        /**
         * int i = 0;   // 循环变量赋初值为 0，只执行一次
         * i < 10;      // 循环条件
         * i++          // 迭代条件
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void infinite (){
        for (int i = 1; i > 0; i++) {
            System.out.println("i = " + i);
        }
    }

    /**
     * 用 main 方法调用执行结果：
     *
     * arr[0] = 2
     * arr[1] = 4
     * arr[2] = 6
     * arr[3] = 7
     */
    public static void arrayFor (){
        int arr[] = {2, 4, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    /**
     * 用 main 方法调用执行结果：
     *
     * a = 2
     * a = 4
     * a = 6
     * a = 7
     */
    public static void arrayEnhancedFor (){
        int arr[] = {2, 4, 6, 7};
        for (int a : arr) {
            System.out.println("a = " + a);
        }
    }
}

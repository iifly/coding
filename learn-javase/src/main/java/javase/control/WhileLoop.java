package javase.control;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/7
 */
public class WhileLoop {


    public static void main(String[] args) {
        // simple();
        // infinite();
        arrayWhile();
    }


    /**
     * 用 main 方法调用执行结果：
     *
     * 5
     * 4
     * 3
     * 2
     * 1
     */
    public static void simple(){
        int i = 5;
        while (i > 0){
            System.out.println(i--);
        }
    }

    public static void infinite (){
        int i = 10;
        while (i > 0){
            // 无迭代条件，就会无限循环
            System.out.println(i);
        }
    }

    /**
     * 用 main 方法调用执行结果：
     *
     * arr[0] = 4
     * arr[1] = 5
     * arr[2] = 6
     * arr[3] = 7
     */
    public static void arrayWhile (){
        int arr[] = {4, 5, 6, 7};
        int i = 0;
        while (i < arr.length) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            i++;
        }
    }
}

package javase.control;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/7
 */
public class DoWhileLoop {


    public static void main(String[] args) {
        simple();
        // arrayWhile();
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
        do{
            System.out.println(i--);
        }
        while (i > 0);
    }

    /**
     * 用 main 方法调用执行结果：
     *
     * arr[0] = 81
     * arr[1] = 14
     * arr[2] = 25
     * arr[3] = 33
     */
    public static void arrayWhile (){
        // int arr[]; // 1. 未初始化数组，编译不通过

        // int arr[] = {}; //2. 索引 0 出无值数组越界

        int arr[] = {81, 14, 25, 33};
        int i = 0;
        do{
            // 数组必须初始化，并且保证索引 0 出有值，不然会编译不通过或数组越界
            System.out.println("arr[" + i + "] = " + arr[i]);
            i++;
        }while (i < arr.length);
    }
}

package javase.operators;


/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class RelationalOperators {
    /**
     * main 方法执行结果;
     *
     * 1 == 1 : true
     * 1 == 2 : false
     * @@@@@@@@@@@@@@@@@@@@@
     * 1 != 1 : false
     * 1 != 2 : true
     * @@@@@@@@@@@@@@@@@@@@@
     * 1 > 1 : false
     * 1 > 2 : false
     * 2 > 1 : true
     * @@@@@@@@@@@@@@@@@@@@@
     * 1 < 1 : false
     * 1 < 2 : true
     * 2 < 1 : false
     * @@@@@@@@@@@@@@@@@@@@@
     * 1 >= 1 : true
     * 1 >= 2 : false
     * 2 >= 1 : true
     * @@@@@@@@@@@@@@@@@@@@@
     * 1 <= 1 : true
     * 1 <= 2 : true
     * 2 <= 1 : false
     */
    public static void main(String[] args) {
        System.out.println("1 == 1 : " + (1 == 1));
        System.out.println("1 == 2 : " + (1 == 2));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("1 != 1 : " + (1 != 1));
        System.out.println("1 != 2 : " + (1 != 2));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("1 > 1 : " + (1 > 1));
        System.out.println("1 > 2 : " + (1 > 2));
        System.out.println("2 > 1 : " + (2 > 1));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("1 < 1 : " + (1 < 1));
        System.out.println("1 < 2 : " + (1 < 2));
        System.out.println("2 < 1 : " + (2 < 1));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("1 >= 1 : " + (1 >= 1));
        System.out.println("1 >= 2 : " + (1 >= 2));
        System.out.println("2 >= 1 : " + (2 >= 1));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("1 <= 1 : " + (1 <= 1));
        System.out.println("1 <= 2 : " + (1 <= 2));
        System.out.println("2 <= 1 : " + (2 <= 1));
    }
}

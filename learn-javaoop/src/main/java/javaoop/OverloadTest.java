package javaoop;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/13
 */
public class OverloadTest {
    public static void main(String[] args) {
        System.out.println(add(1, "1"));
        System.out.println(add(1, 1));
        System.out.println(add(1, 1, 1));
    }


    static String add(int a, String s){
        return a + s;
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
}

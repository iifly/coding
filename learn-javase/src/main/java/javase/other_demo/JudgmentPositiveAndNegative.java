package javase.other_demo;


/**
 * @author zh-hq
 * @Description 判断正负 other_demo
 * @date 2022/1/18
 */
public class JudgmentPositiveAndNegative {

    /**
     * 程序输出结果：
     *
     * 0 : 既不是正数也不是负数
     */
    public static void main(String[] args) {
        judgment(0);
    }

    public static void judgment(int num){
        if (num > 0) {
            System.out.println(num + " : 是正数");
        } else if (num < 0) {
            System.out.println(num + " : 是正数");
        }else {
            System.out.println(num + " : 既不是正数也不是负数");
        }
    }

}

package javase.string;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/10
 */
public class StringDemo {
    public static void main(String[] args) {
        createStr();
    }

    /**
     * 创建字符串
     * main 方法调用执行结果：
     *
     * str1 equals str2 : true
     * str3 equals str4 : false
     * str5 : coding
     * str6 :
     */
    public static void createStr(){
        String str1 = "coding";
        String str2 = "coding";
        System.out.println("str1 equals str2 : " + (str1 == str2)); // true
        String str3 = new String("coding");
        String str4 = new String("coding");
        System.out.println("str3 equals str4 : " + (str3 == str4)); // false

        char[] chars = {'c','o','d','i','n','g'};
        String str5 = new String(chars);
        System.out.println("str5 : " + str5);

        String str6 = new String();
        System.out.println("str6 : " + str6);
    }
}

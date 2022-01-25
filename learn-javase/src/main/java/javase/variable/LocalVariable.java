package javase.variable;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/22
 */
public class LocalVariable {
    String var = "成员变量";

    void method(){
        String var = "方法内变量";
        System.out.println(var);
    }

    /**
     * main 方法输出结果：
     *
     * 调用一下方法，会打印方法里的变量 var :方法内变量
     * 打印类的变量 var :成员变量
     */
    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();
        System.out.print("调用一下方法，会打印方法里的变量 var :");
        obj.method();
        System.out.println("打印类的变量 var :" + obj.var);
        // 可见方法之外访问不到方法内的局部变量，
        // 但方法内可以访问外部的成员，这会用到 this 关键字，我们留点悬念以后再说
    }
}

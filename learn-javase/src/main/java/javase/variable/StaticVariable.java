package javase.variable;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/22
 */
public class StaticVariable {
    /**
     * 声明一个静态变量 staticVar (静态变量声明 是用 static 关键字修饰变量即可)
     */
    static String staticVar = "initValue";

    /**
     * main 方法输出结果：
     *
     * obj1.staticVar:initValue
     * obj2.staticVar:initValue
     * obj3.staticVar:initValue
     * 用其中一个对象修改静态变量
     * 再分别访问静态变量
     * obj1.staticVar:newValue
     * obj2.staticVar:newValue
     * obj3.staticVar:newValue
     * 最后，我们可以直接用类名访问静态变量，如下
     * StaticVariable.staticVar:newValue
     */
    public static void main(String[] args) {
        // 创建 3 个对象
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();
        // 访问 静态变量 staticVar (其实不推荐用对象访问静态变量，用 【类名.静态变量名】 方式更好)
        System.out.println("obj1.staticVar:" + obj1.staticVar);
        System.out.println("obj2.staticVar:" + obj2.staticVar);
        System.out.println("obj3.staticVar:" + obj3.staticVar);
        System.out.println("用其中一个对象修改静态变量");
        obj2.staticVar = "newValue";
        System.out.println("再分别访问静态变量");
        System.out.println("obj1.staticVar:" + obj1.staticVar);
        System.out.println("obj2.staticVar:" + obj2.staticVar);
        System.out.println("obj3.staticVar:" + obj3.staticVar);
        System.out.println("最后，我们可以直接用类名访问静态变量，如下");
        System.out.println("StaticVariable.staticVar:" + StaticVariable.staticVar);
    }
}


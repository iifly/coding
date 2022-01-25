package javase.variable;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/22
 */
public class InstanceVariable {
    /**
     * 成员变量（实例变量） var
     */
    String var = "initValue";

    /**
     * main 方法输出结果
     *
     * obj1.var:initValue
     * obj2.var:initValue
     * obj3.var:initValue
     * 用 obj2 改变 var 的值
     * 再分别访问实例变量
     * obj1.var:initValue
     * obj2.var:newValue
     * obj3.var:initValue
     */
    public static void main(String[] args) {
        // 创建 3 个对象
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        InstanceVariable obj3 = new InstanceVariable();
        // 访问 实例变量 var
        System.out.println("obj1.var:" + obj1.var);
        System.out.println("obj2.var:" + obj2.var);
        System.out.println("obj3.var:" + obj3.var);
        System.out.println("用 obj2 改变 var 的值");
        obj2.var = "newValue";
        System.out.println("再分别访问实例变量");
        System.out.println("obj1.var:" + obj1.var);
        // 只有 obj2.var 的值改变
        System.out.println("obj2.var:" + obj2.var);
        System.out.println("obj3.var:" + obj3.var);

        //实例变量不能通过类名访问，以下代表会报错，因为实例变量属于实例对象，每个对象都有自己变量副本，互不影响
        // System.out.println("StaticVariable.staticVar:" + InstanceVariable.staticVar);
    }
}

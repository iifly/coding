package javaoop;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/13
 */
public class ConstructorTest {
    /**
     * main 方法执行结果：
     *
     * jinx-18
     * lax-19
     */
    public static void main(String[] args) {
        User obj1 = new User();
        User obj2 = new User("lax", 19);
        System.out.println(obj1.name + "-" + obj1.age);
        System.out.println(obj2.name + "-" + obj2.age);
    }
}
class User{
    String name;
    int age;
    // 默认的构造器——如果没有主动声明任何构造器，编译器会自动给我们生成
    // public ConstructorTest() {
    // }

    // 无参构造器
    public User() {
        this.name = "jinx";
        this.age = 18;
    }
    // 参数化构造器
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

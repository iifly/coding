package javaoop;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/13
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // 无参构造方法创建对象
        User obj1 = new User();
        // 有参构造方法创建对象
        User obj2 = new User("lax", 19);
        System.out.println(obj1.name + "-" + obj1.age);
        System.out.println(obj2.name + "-" + obj2.age);
    }
}
class User{
    String name;
    int age;
    // 默认的构造器——如果没有主动声明任何构造器，编译器会自动给我们生成在字节码文件中 (.class)
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

class MyClass{
    public String name;
    // 无参构造方法 - 没有返回值并且名称与类名相同
    public MyClass(){
        System.out.println("调用无参构造方法创建对象");
        System.out.println("name 属性初始化化为 :" + "coding");
        name = "coding";
    }

    public static void main(String[] args) {
        // 调用无参构造方法创建一个对象，并赋值给 aClass 类型的变量
        MyClass aClass = new MyClass();
        System.out.println("aClass.name = " + aClass.name);
    }
}

class MyClass2{
    public String name;
    // 有参构造方法 - 没有返回值并且名称与类名相同
    public MyClass2(String name){
        System.out.println("调用有参构造方法创建对象");
        System.out.println("name 属性初始化为参数 name 值:" + name);
        this.name = name;
    }

    public static void main(String[] args) {
        // 调用有参构造方法创建一个对象，并赋值给 aClass 类型的变量
        MyClass2 aClass = new MyClass2("coding class");
        System.out.println("aClass.name = " + aClass.name);
    }
}

class ConstructorChain {

    public static void main(String[] args) {
        System.out.println("<=========son 1===========>");
        Son son = new Son();
        System.out.println("<=========son 2===========>");
        Son son2 = new Son("son2");
    }
}

// 父类，基类
class Father{
    private String name;

    public static int step = 1;
    // 静态代码按定义顺序从上往下执行，所有这里先定义了 step
    static {
        System.out.println(Father.step++ + "-父类-静态变量初始化");
        System.out.println(Father.step++ + "-父类-静态代码块初始化");
    }

    public int var = Father.step++;
    // 初始化块
    {
        System.out.println(var + "-父类-成员变量初始化");
        System.out.println(Father.step++ + "-父类-初始化块初始化");
    }
    public Father(){
        System.out.println(Father.step++ + "-父类-无参构造方法初始化");
    }


    public Father(String name) {
        this.name = name;
        System.out.println(Father.step++ + "-父类-有参构造方法初始化");
    }
}

// 子类、衍生类
class Son extends Father{

    public static int sonStation = Father.step++;
    static {
        // 静态代码按定义顺序从上往下执行，所有这里先定义了 step
        System.out.println(sonStation + "-子类-静态变量初始化");
        System.out.println(Father.step++ + "-子类-静态代码块初始化");
    }

    public int var = Father.step++;
    // 初始化块
    {
        System.out.println(var + "-子类-成员变量初始化");
        System.out.println(Father.step++ + "-子类-初始化块初始化");
    }

    // 调用自己的无参构造方法
    public Son() {
        // 调用父类的无参构造方法,写或不写都会默认生成
        // 如果父类没有无参构造方法，必须指明调用那个构造方法
        // super();
        System.out.println(Father.step++ + "-子类-无参构造方法初始化");
    }

    public Son(String name) {
        // 在子类构造方法中的第一行语句，使用 super 调用父类构造方法
        super(name); // 调用父类的有参构造方法
        System.out.println(Father.step++ + "-子类-有参构造方法初始化");
    }
}
package javaoop.object_concepts;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/27
 */
public class Book {
    /**
     * [属性]书名
     */
    String name;

    /**
     * [属性]作者
     */
    String author;

    /**
     * [行为]阅读
     */
    void read(){
       // do something
    }

    /**
     * [行为]做笔记
     */
    void writeNote(){
        // do something
    }

    // 在 Book 类中声明一个有参构造器 constructor
    public Book(String name){
        this.name = name;
    }

    /**
     * main 方法执行结果：
     *
     * Java
     * C
     */
    public static void main(String[] args) {
        // 通过上面声明的构造器创建对象 javaBook,设置其 name 值为 "Java"
        Book javaBook = new Book("Java");
        Book cBook = new Book("C");
        // 打印 javaBook 的 name 属性
        System.out.println(javaBook.name);
        System.out.println(cBook.name);
    }
}

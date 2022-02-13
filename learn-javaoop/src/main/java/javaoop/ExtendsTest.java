package javaoop;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/13
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // eat 方法继承自父类 Animal
        dog.eat();
        // run 方法 Dog 特有的
        dog.run();
        Bird bird = new Bird();
        bird.eat();
        // fly 方法 Bird 特有的
        bird.fly();
        Fish fish = new Fish();
        fish.eat();
        // swim 方法 Fish 特有的
        fish.swim();
    }
}

class Animal {
    /**
     * 名称
     */
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(name + "吃东西！");
    }
}

class Dog extends Animal{
    // 构造器
    public Dog() {
        super("狗");
    }

    void run(){
        System.out.println(name + "跑...");
    }
}

class Bird extends Animal{
    // 构造器
    public Bird() {
        super("鸟");
    }

    void fly(){
        System.out.println(name + "飞...");
    }
}


class Fish extends Animal{
    // 构造器
    public Fish() {
        super("鱼");
    }

    void swim(){
        System.out.println(name + "游...");
    }
}

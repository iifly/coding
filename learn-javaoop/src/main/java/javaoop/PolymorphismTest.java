package javaoop;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/13
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        // 编译看左边，运行看右边
        AbstractAnimal animal = new Sheep();
        animal.animalSound();// 咩咩咩~ 引用不同的子类对象执行其表现形式不同
        animal = new Cat();
        animal.animalSound();// 喵喵喵~ 引用不同的子类对象执行其表现形式不同
    }
}

// 有抽象方法的类也必须是抽象的，反之抽象类不一定有抽象方法
abstract class AbstractAnimal{
    //...
    //  定义抽象方法
    public abstract void animalSound();
}

class Sheep extends AbstractAnimal{
    // 重写实现 animalSound()
    @Override
    public void animalSound() {
        System.out.println("咩咩咩~");
    }
}

class Cat extends AbstractAnimal{
    // 重写实现 animalSound()
    @Override
    public void animalSound() {
        System.out.println("喵喵喵~");
    }
}

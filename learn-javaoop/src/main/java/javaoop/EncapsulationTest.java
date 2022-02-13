package javaoop;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/13
 */
public class EncapsulationTest {

    public static void main(String[] args) {
        Person jack = new Person("jack", 17, 0);
        System.out.println(jack.getName());
        System.out.println(jack.getGender());
        jack.work();
    }
}

class Person{
    private String name;
    private int age;
    private int gender;

    public Person(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    /**
     * 外部程序只可以通过此方法获取性别属性 - 男或女，
     */
    public String getGender() {
        return gender == 0 ? "男" : "女";
    }

    public void work() {
        if (age <= 18 ) {
            System.out.println(name + " 年纪太小了，还不能工作");
        } else if(age >= 55){
            System.out.println(name + " 年纪太大了，不能工作了");
        }else {
            System.out.println(name + " 正努力工作");
        }
    }
}
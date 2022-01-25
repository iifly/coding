package javase.other_demo;

/**
 * @author zh-hq
 * @Description 查询字符 ASCII
 * ASCII是表示作为数字的英文字符的代码，每个英文字母表被分配0到127的数字。例如，大写P的ASCII代码为80。
 * @date 2022/1/22
 */
public class FindASCII {
    /**
     * main 方法输出结果：
     *
     * 在 Java 中可以有两种方法获取字符的 ASCII
     * 1. 把字符(char)强制转为 int 类型
     * 字符 'A' 的 ASCII 为：65
     * 2. 把 int 类型的变量赋一个 字符 的值
     * 字符 'c' 的 ASCII 为：99
     */
    public static void main(String[] args) {
        System.out.println("在 Java 中可以有两种方法获取字符的 ASCII");
        System.out.println("1. 把字符(char)强制转为 int 类型");
        char ch = 'A';
        //强制转型,但是 char 转为 int 会自动转型，所以（int）可以省略
        int ch_ASCII = (int)ch;
        // int ch1_ASCII = ch1;
        System.out.println("字符 'A' 的 ASCII 为：" + ch_ASCII);
        System.out.println("2. 把 int 类型的变量赋一个 字符 的值");
        int ascii = 'c';
        System.out.println("字符 'c' 的 ASCII 为：" + ascii);

    }
}

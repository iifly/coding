package javase.control;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class SwitchCaseStatement {
    public static void main(String[] args) {
        simple(5);
        System.out.println("-----------------");
        noBreak(2);
        System.out.println("-----------------");
        withBreak(2);
    }

    /**
     * 输入: 5
     * 输出：
     * <default>
     */
    public static void simple(int num){
        switch (num){
            case 1:
                System.out.println(num + "小于等于" + 1);
            case 2:
                System.out.println(num + "小于等于" + 2);
            case 3:
                System.out.println(num + "小于等于" + 3);
            case 4:
                System.out.println(num + "小于等于" + 4);
            default:
                System.out.println("<default>");
        }
    }

    /**
     * 夏天
     * 秋天
     * 冬天
     * <default>
     */
    public static void noBreak(int num){
        switch (num){
            case 1:
                System.out.println("春天");
            case 2:
                System.out.println("夏天");
            case 3:
                System.out.println("秋天");
            case 4:
                System.out.println("冬天");
            default:
                System.out.println("<default>");
        }
    }


    /**
     * 夏天
     */
    public static void withBreak(int num){
        switch (num){
            case 1:
                System.out.println("春天");
                break;
            case 2:
                System.out.println("夏天");
                break;
            case 3:
                System.out.println("秋天");
                break;
            case 4:
                System.out.println("冬天");
                break;
            default:
                System.out.println("<default>");
        }
    }
}

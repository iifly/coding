package javase.operators;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class LogicalOperators {
    /**
     * main 方法执行结果：
     *
     * true && true = true
     * true && false = false
     * false && true = false
     * false && false = false
     * ================================
     * true || true = true
     * true || false = true
     * false || true = true
     * false || false = false
     * ================================
     * !true = false
     * !false = true
     */
    public static void main(String[] args) {
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println("================================");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println("================================");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
    }
}

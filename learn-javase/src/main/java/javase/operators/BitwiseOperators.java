package javase.operators;

/**
 * @author zh-hq
 * @Description
 * @date 2022/1/29
 */
public class BitwiseOperators {
    /**
     * 程序中高位 0 没有打印除
     * main 方法输出结果：
     *
     * 1001 & 1010 ==>                             1000
     * 1001 | 1010 ==>                             1011
     * 1001 ^ 1010 ==>                               11
     * ~1001       ==> 11111111111111111111111111110110
     * 1001 << 2   ==>                           100100
     * -5 二进制数  ==> 11111111111111111111111111111011
     * -5 >>  2    ==> 11111111111111111111111111111110
     * -5 >>> 2    ==>   111111111111111111111111111110
     * 5 二进制数   ==>                              101
     * 5 >>  2     ==>                                1
     * 5 >>> 2     ==>                                1
     */
    public static void main(String[] args) {
        // 二进制数 0B 开头
        int x = 0B1001;
        int y = 0B1010;
        /**
         * 1001
         * 1010
         * ————& 与，如果相对应位都是 1，则结果为 1，否则结果为 0
         * 1000
         */
        System.out.println("1001 & 1010 ==> " + String.format("%32s", Integer.toBinaryString(x & y)));

        /**
         * 1001
         * 1010
         * ———— | 或，如果相对应位都是 0，则结果为 0，否则为 1
         * 1011
         */
        System.out.println("1001 | 1010 ==> " + String.format("%32s", Integer.toBinaryString(x | y)));

        /**
         * 1001
         * 1010
         * ———— ^ 异或，如果相对应位值相同，则结果为 0，否则为 1
         * 0011
         */
        System.out.println("1001 ^ 1010 ==> " + String.format("%32s", Integer.toBinaryString(x ^ y)));

        /**
         * 1001
         * ———— ~ 取反，按位取反运算符翻转操作数的每一位，即 0 变成1 ，1 变成 0
         * 0110
         * 因为整形占4个字节（32位），除了有效位前面都是 0，取反之后都是 1
         */
        System.out.println("~1001       ==> " + String.format("%32s", Integer.toBinaryString(~x)));

        /**
         *   1001
         * ———————— << 2 按位左移 2 位,移动得到的空位以零填充
         * 100100
         */
        System.out.println("1001 << 2   ==> " + String.format("%32s", Integer.toBinaryString(x << 2)));

        /**
         * >> 右移，右移指定的位数，移动得到的空位正数以 0 填充 ,负数以 1 填充
         * >>> 右移补零。右移指定的位数，移动得到的空位以 0 填充
         */
        System.out.println("-5 二进制数  ==> " + String.format("%32s", Integer.toBinaryString(-5)));
        System.out.println("-5 >>  2    ==> " + String.format("%32s", Integer.toBinaryString(-5 >> 2)));
        System.out.println("-5 >>> 2    ==> " + String.format("%32s", Integer.toBinaryString(-5 >>> 2)));
        System.out.println("5 二进制数   ==> " + String.format("%32s", Integer.toBinaryString(5)));
        System.out.println("5 >>  2     ==> " + String.format("%32s", Integer.toBinaryString(5 >> 2)));
        System.out.println("5 >>> 2     ==> " + String.format("%32s", Integer.toBinaryString(5 >>> 2)));
    }
}

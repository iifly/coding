# return 语句

return 语句有两个作用：

- 一个是返回方法指定类型的值（这个值总是确定的 `return 值;`）
- 一个是结束方法的执行（仅仅一个 `return;` 语句）

## 代码示例

```java
public class ReturnStatement {
    /**
     * main 方法执行结果：
     *
     * x 与 y 之和为： 5
     * 5 是奇数
     */
    public static void main(String[] args) {
        // add 方法返回 x 和 y 之和
        int sum = add(1, 4);
        System.out.println("x 与 y 之和为： " + sum);
        printNum(sum);
    }

    public static int add(int x, int y){
        // 返回 一个 int 值，x 和 y 之和。
        return x + y;
    }

    public static void printNum(int num){
        if (num % 2 != 0){
            System.out.println(num + " 是奇数");
            // 结束方法
            return;
        }
        System.out.println(num + " 是偶数");
    }
}
```

## 阅读资料

-

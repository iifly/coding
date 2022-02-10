# continue 语句

`continue` 在循环体代码中使用，用于结束当前循环，忽略循环体中 `continue;` 之后的代码，直接进入下次循环。

使用语法：`continue;`

## 代码示例

```java
public class ContinueStatement {
    /**
     * main 方法执行结果：
     *
     * i = 2
     * i = 4
     * i = 6
     * i = 8
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                // 如果 i 不是偶数则直接进入下次循环
                continue;
            }
            // 如果 i 是偶数则会执行到以下代码
            System.out.println("i = " + i);
        }
    }
}
```

## 阅读资料

- [初学者教程 continue 语句](https://beginnersbook.com/2017/08/java-continue-statement/)

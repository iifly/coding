# break 语句

`break` 语句有两种以下使用情况:

- 在循环体中使用，用于终止整个循环，不再执行循环体中的 `break` 之后的代码，也不再执行下次循环，而是跳转至循环之后的代码。
  当循环嵌套时使用 `break` 只会终止当前层的循环。

- 在 `switch-case` 语句中使用，通常 `switch-case` 语句的每个 `case:` 项都会有一个`break;` 语句，用于程序进入此 `case` 项时，
  控制程序跳出 `switch-case` 语句，不让程序向之后的 `case` 项。

使用语法; `break;`

## 代码示例

### 在循环中使用 break

```java
public class BreakStatement {
    /**
     * main 方法执行结果：
     *
     * arr[0] = 1[不是偶数]
     * arr[1] = 3[不是偶数]
     * arr[2] = 6[找到第一个偶数]
     */
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("arr[" + i + "] = " + arr[i] + "[找到第一个偶数]");
                // 找到第一个偶数 结束循环
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i] + "[不是偶数]");
        }
    }
}
```

### 在 switch-case 语句中使用 break

移步：[switch-case 分支](./switch-case%20分支)

## 阅读资料

- [初学者教程 break 语句](https://beginnersbook.com/2017/08/java-break-statement/)

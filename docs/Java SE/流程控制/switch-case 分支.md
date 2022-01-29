# switch-case 分支

## 背景
当我们有很多选项，并且需要为每个选项执行不同的任务时，我们就会使用`switch-case` 语句。其语法格式如下：  
```java
switch(){
    case constant:
        语句块
        ;
    case constant:
        语句块
        ;
    ...
    case constant:
        语句块
        ;
    default:
        语句块
        ;
}
```

## 简单使用示例
```java
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
```

上面代码中，`num` 等于 `5`，并没有对应的 `case` 选项，所以会执行 `default` 中的语句块。

> `switch-case` 一般与 `break` 语句一起搭配使用，尽管 `break` 是可选的。我们先看不带 `break` 的 `switch-case` 示例，然后再看带 `break` 的示例。  

## 不带break使用示例
```java
/**
 * 输入： 2
 * 输出：
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
```

通过以上代码我们可以发现，虽然我们给出的 `num` 等于 `2`，能匹配到 `case 2:`并且执行了其中的代码块，但是接下来所有选项的代码块也都执行了一遍，这也是为什么 `switch` 一般需要搭配 `break` 使用的原因，让我们看看下面的例子，`break` 语句起到了什么作用。

## 带有break使用示例
```java
/**
 * 输入： 2
 * 输出：
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
```

从执行结果可知，我们同样给 `num` 赋值为 `2`,但是这次只执行了 `case 2:` 中的代码块，接下来的其他选项代码块并没有再执行，所以 `break` 起到的作用就是跳出 `switch` 语句。


## 总结

## 阅读资料
* [初学者教程 switch-case](https://beginnersbook.com/2017/08/java-switch-case/)
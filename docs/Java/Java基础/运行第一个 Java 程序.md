# 运行第一个 Java 程序

本篇我们讲一下如何编写、编译、运行一个程序，然后介绍一些 Java 语法，代码规范。

## 一个简单的 Java 程序

```java
public class HelloWorld {
    public static void main(String []args) {
       System.out.println("Hello World");
    }// main 方法的结束
}// HelloWorld 类定义的结束
```

输出结果：`Hello World`

## 编译运行

> **前提**：要编译运行上面的程序，我们需要先在系统上安装 Java 环境，也是就是 JDK，可以在[Oracle 官网下载](https://www.oracle.com/java/technologies/downloads/)JDK，并配置环境变量—[Java 环境搭建-菜鸟教程](https://www.runoob.com/java/java-environment-setup.html)。

1. 首先我们打开记事本，复制以上代码粘贴到文本中

   > 你可以使用类似 Eclipse、IntelliJ IDEA 的 IDE 来运行 Java 程序。

2. 把文件保存为 `HelloWorld.java`，请确保这样做，因为 Java 文件的命名是与`public class`紧跟的类名相同的，我们的代码是`public class HelloWorld`，所以我们的文件名也必须命名为 `HelloWorld`，而`.java`是 Java 文件的扩展名。
3. 编译我们的程序，在 Windows 上打开命令提示符（CMD）,如果是用的 Mac OS 请打开终端，进入文件所在目录，输入命令： `javac HelloWorld.java`

   > `javac` 命令把 java 源代码编译成字节码文件

4. 编译成功之后，在刚刚的名录下生成了一个文件名相同，扩展名为`.class`的字节码文件，现在我们执行程序，输入命令： `java HelloWorld`

   > `java`命令解释执行生成的字节码文件

5. 控制台输出：`Hello World`​

好了，整个程序编写、编译、执行完成，编写好代码后，编译执行流程如下：

> Tip：我的文件在 `D:\javaDemo\`目录，系统是 Windows，环境变量已配置

```bat
D:\javaDemo>javac HelloWorld.java

D:\javaDemo>java HelloWorld
Hello World

D:\javaDemo>
```

## 回顾我们的程序

现在我们已经知道怎么运行一个简单的 Java 程序了，让我们来回顾一下上面写的 Java 程序。
​

1. 第一行代码

`public class HelloWorld {`
每个 Java 应用程序必须至少有一个类，类用关键字`class`声明，紧跟在`class`关键字之后的就是类的名字。
​

我们称`class`为关键字，是因为它是 Java 语言所规定的，声明类只能使用`class`,但是类的名字我们可以自己定义。
​

行末有一个大括号`{`前半部分，我们类的定义就是在声明类之后的一对大括号里，这里`{`是大括号的开始，类定义完之后又已`}`作为结尾。

> Tip：
> 大括号、中括号、括号等都是成对出现的。
> 这里的大括号也不是必须写在结尾，只是大家约定成俗的一种 Java 规范。

2. 第二行代码我们分开几个部分来解释理解它

`public`
这是一个访问修饰符，修饰了我们紧跟着的 `main`方法，`public`表示`main`是公共的，可以从类的外部来调用此方法。
​

`static`
这是一个非访问修饰符，表示`main`方法并且还是静态的，我们不用创建此的对象就能直接调用此方法。
​

`void`
这是方法的返回值类型，`void`表示此方法不会返回任何东西。
​

`main`
这是方法的名字，`main`方法是 JVM 运行程序的入口。
​

`(String[] args)`
这是方法的参数列表，这里用字符串来接收命令行传递的参数，这里后面会再分析。
​

`{`
这是方法定义的开始。方法体定义在声明方法的一对大括号里。
​

3. 第三行代码

`System.out.println("Hello World");`
这是方法体的内容，这句代码的作用是把双引号之间的内容输出到控制台，并换行。

4. 剩下的代码

接下就剩下两个大括号的后半部分，分别表示`main`方法的结束和`HelloWorld`类定义的结束。
代码中我用`//`写了一些注释，这种注释在编译时就被丢弃，并不会影响我们程序的运行。Java 中有多种注释方式，后面会再讲。

## 阅读资料

- [初学者教程-Java 第一个程序](https://beginnersbook.com/2013/05/first-java-program/)

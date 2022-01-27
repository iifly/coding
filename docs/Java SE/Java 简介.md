# Java 简介

> Tip：初衷-从头梳理自己的Java体系，顺便记点笔记，写得不严谨的地方请见谅。

Java 由 Sun Microsystems Inc 于 1991 年开发，后来被 Oracle Corporation 收购。它是由 James Gosling 和 Patrick Naughton 开发的。
这是一种简单的编程语言，在 java 中编写、编译和调试程序很容易。
它有助于构建模块化程序和可重用代码。
## Java 术语

> Tip：在学习 Java 之前，我们现了解一下 Java 的术语。

### Java Virtual Machine（JVM）
通常我们直接叫它 JVM，在介绍 JVM 之前，我来看看程序的运行各个阶段。
阶段如下：

1. 编写程序，这一阶段由向你或我这样的 Java 程序员完成。
1. 编译程序，这一阶段由 javac 编译器完成，javac 是 Java开发工具包（JDK）中包含的主要编译器，它可以把 Java  程序编译成 Java 字节码。
1. 运行程序，由 JVM 执行上一步生成的 Java 字节码。

所以 JVM 的功能就是执行编程源程序生成的 Java 字节码。
**每一种操作系统都有不同的 JVM ，但是他们执行相同的 Java 字节码得到的结果是相同的。**
所有我们称 Java 是一种平台独立语言**。**
### bytecode
如上所述，字节码是由 JDK 的 javac 编译器编译而成，可以被 JVM 执行的一种代码，它被编译器保存在扩展名是`.class`的文件中。
### Java Development Kit（JDK）
顾名思义，这是一个完整的 Java 开发工具包。
它包含 Java 运行时环境—— JRE（Java Runtime Environment）,编译器和各种工具，如 JavaDoc、Java 调试器...
为了创建、编译、运行 Java 程序，需要在计算机上安装 JDK。
### Java Runtime Environment（JRE）
从 JDK 的介绍中我们知道 JDK 包含 JRE，所有 JRE 是 JDK 的一部分。
JRE 包含 JVM、浏览器插件、小程序支持。
如果只是想在计算机上运行 Java 程序，只需要安装 JRE 就够了。
安装了 JRE 可以运行 Java 程序，但是不能编译 Java 程序。
> Tip：如果你想了解更多的 Java 术语，请移步：[Java 术语表](https://docs.oracle.com/javase/tutorial/information/glossary.html)

## Java 语言的主要特点
> Tip：Java 语言的风格很像 C 语言和 C++ 语言，是一种纯粹的面向对象语言，它继承了 C++ 语言面向对象的技术核心，但是拋弃了 C++ 的一些缺点，比如说容易引起错误的指针以及多继承等，同时也增加了垃圾回收机制，释放掉不被使用的内存空间，解决了管理内存空间的烦恼。

### 平台无关性（Platform Independent）和可移植（Portable）
上面我们介绍过**：每一种操作系统都有不同的 JVM ，但是他们执行相同的 Java 字节码得到的结果是相同的。**
Java 程序只需要编译一次生成字节码，就可以运行在任何平台的 JVM 上，如 Windows、Linux、Mac OS等。
因此 Java 是“一次编写，到处运行（Write Once，Run any Where）”的语言，采用 Java 语言编写的程序具有很好的可移植性。
### 面向对象（Object Oriented）


面向对象编程是一种用对象的集合组织程序的方式，每个对象都是类的实例。
面向对象有四个主要概念：

1. 抽象（Abstraction）
1. 封装（Encapsulation）
1. 继承（Inheritance）
1. 多态（Polymorphism）
### 简单性（Simple）
Java 语言的语法与 C 语言和 C++ 语言很相近，使得很多程序员学起来很容易。对 Java 来说，它舍弃了很多 C++ 中难以理解的特性，如操作符的重载和多继承等，而且 Java 语言不使用指针，加入了垃圾回收机制，解决了程序员需要管理内存的问题，使编程变得更加简单。


### 健壮性（Robust）
健壮意味着可靠。Java 强调早期检查一些可能出现的错误，这就是为什么 Java 编译器能够更容易检测到一些其他语言不容易检测到的错误。
Java 的强类型机制、异常处理、垃圾收集、内存分配等都是 Java 健壮性的重要保证。
### 安全（Secure）
Java 没有指针，也不能访问绑定数组范围之外的数据（如果你非要这么做，编译器会抛出数组下标越界异常 ArrayIndexOutOfBoundsException），所以在Java 不会出现
### 分布式（Distributed）
使用 Java 语言我们可以创建分布式应用程序。
简而言之：Java 程序可以分布在多个通过互联网彼此连接的系统上。
y远程方法调用 RMI（Remote Method Invocation、远程过程调用 RPC（Remote Process Call）和 EJB 常用于创建分布式应用。
### 多线程（Multithreading）
Java 语言支持多线程，这也是 Java 语言的一大特性，它允许并发执行两个或多个程序，最大限度运用 CPU。
Java 线程必须由 Thread 类和它的子类来创建，任何一个线程都有自己的`run()`方法，要执行的方法就写在 run() 方法体内。
> Tip：直接调用线程对象的run()只是当前线程内执行一个普通方法，并不会创建线程，只有调用线程对象的start()方法才会创建一个新的线程去执行run()方法内容。

### 高性能
Java 的高性能主要是相对其他高级脚本语言来说的，随着 JIT（Just in Time）的发展，Java 的运行速度也越来越高。
## Java 语言体系

- **Java SE --- 标准版(Standard )**
Java SE（Java Platform Standard Edition，Java 平台标准版）以前称为 J2SE，它允许开发和部署在桌面、服务器、嵌入式环境和实时环境中使用的 Java 应用程序。

Java SE 包含了支持 Java Web 服务开发的类，并为 Java EE 提供基础，如 Java 语言基础、JDBC 操作、I/O 操作、网络通信以及多线程等技术。 

- **Java EE --- 企业版(Enterprise)**
Java EE（Java Platform Enterprise Edition，Java 平台企业版）以前称为 J2EE。

企业版本帮助开发和部署可移植、健壮、可伸缩且安全的服务器端 Java 应用程序。Java EE 是在 Java SE 基础上构建的，它提供 Web 服务、组件模型、管理和通信 API，可以用来实现企业级的面向服务体系结构（Service Oriented Architecture，SOA）和 Web 2.0 应用程序。 

- **Java ME --- 微缩版(Micro)**
Java ME（Java Platform Micro Edition，Java 平台微型版）以前称为 J2ME，也叫 K-JAVA。 

Java ME 为在移动设备和嵌入式设备（比如手机、PDA、电视机顶盒和打印机）上运行的应用程序提供一个健壮且灵活的环境。 
## 总结
Java 介绍就到这里，都是照搬的，有个印象就行。
## 阅读资料
- [Java 初学者教程](https://beginnersbook.com/2013/05/java-introduction/)

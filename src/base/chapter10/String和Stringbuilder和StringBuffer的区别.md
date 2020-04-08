String是只读字符串，它并不是基本数据类型，而是一个对象。从底层源码来看是一个final类型的字符
数组，所引用的字符串不能被改变，一经定义，无法再增删改。每次对String的操作都会生成新的
String对象。
```java
private final char value[];
```
每次+操作 ： 隐式在堆上new了一个跟原字符串相同的StringBuilder对象，再调用append方法 拼接
+后面的字符。
StringBuffer和StringBuilder他们两都继承了AbstractStringBuilder抽象类，从AbstractStringBuilder
抽象类中我们可以看到
```java
/**
* The value is used for character storage.
*/
char[] value;
```
他们的底层都是可变的字符数组，所以在进行频繁的字符串操作时，建议使用StringBuffer和
StringBuilder来进行操作。 另外StringBuffer 对**方法加了同步锁或者对调用的方法加了同步锁**，所以是
**线程安全**的。StringBuilder **并没有对方法进行加同步锁**，所以是**非线程安全**的
**==** 
比较的是变量(栈)内存中存放的对象的(堆)内存地址，用来判断两个对象的地址是否相同，即是否是
指相同一个对象。比较的是真正意义上的指针操作。
1、比较的是操作符两端的操作数是否是同一个对象。
2、两边的操作数必须是同一类型的（可以是父子类之间）才能编译通过。
3、比较的是地址，如果是具体的阿拉伯数字的比较，值相等则为true，如：
int a=10 与 long b=10L 与 double c=10.0都是相同的（为true），因为他们都指向地址为10的堆。
**equals：**
equals用来比较的是两个对象的内容是否相等，由于所有的类都是继承自java.lang.Object类的，所以
适用于所有对象，如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，而Object中的
equals方法返回的却是==的判断。
**总结：**
所有比较是否相等时，都是用equals 并且在对常量相比较时，把常量写在前面，因为使用object的
equals object可能为null 则空指针
在阿里的代码规范中只使用equals ，阿里插件默认会识别，并可以快速修改，推荐安装阿里插件来排
查老代码使用“==”，替换成equals
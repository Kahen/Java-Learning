**1、两者父类不同**
HashMap是继承自AbstractMap类，而Hashtable是继承自Dictionary类。不过它们都实现了同时实现
了map、Cloneable（可复制）、Serializable（可序列化）这三个接口。
**2、对外提供的接口不同**
Hashtable比HashMap多提供了elments() 和contains() 两个方法。
elments() 方法继承自Hashtable的父类Dictionnary。elements() 方法用于返回此Hashtable中的
value的枚举。
contains()方法判断该Hashtable是否包含传入的value。它的作用与containsValue()一致。事实上，
contansValue() 就只是调用了一下contains() 方法。
**3、对null的支持不同**
Hashtable：key和value都不能为null。
HashMap：key可以为null，但是这样的key只能有一个，因为必须保证key的唯一性；可以有多个key
值对应的value为null。
**4、安全性不同**
HashMap是线程不安全的，在多线程并发的环境下，可能会产生死锁等问题，因此需要开发人员自己
处理多线程的安全问题。
Hashtable是线程安全的，它的每个方法上都有synchronized 关键字，因此可直接用于多线程中。
虽然HashMap是线程不安全的，但是它的效率远远高于Hashtable，这样设计是合理的，因为大部分的
使用场景都是单线程。当需要多线程操作的时候可以使用线程安全的ConcurrentHashMap。
ConcurrentHashMap虽然也是线程安全的，但是它的效率比Hashtable要高好多倍。因为
ConcurrentHashMap使用了分段锁，并不对整个数据进行锁定。
**5、初始容量大小和每次扩充容量大小不同**
int[] a = new int[4];//推介使用int[] 这种方式初始化
int c[] = {23,43,56,78};//长度：4，索引范围：[0,3]
**6、计算hash值的方法不同**
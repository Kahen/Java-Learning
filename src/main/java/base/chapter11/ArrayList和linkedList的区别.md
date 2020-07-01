**11、ArrayList和linkedList的区别
Array（数组）是基于索引(index)的数据结构，它使用索引在数组中搜索和读取数据是很快的。**
Array获取数据的时间复杂度是O(1),但是要删除数据却是开销很大，因为这需要重排数组中的所有数据,
(因为删除数据以后, 需要把后面所有的数据前移)
缺点: 数组初始化必须指定初始化的长度, 否则报错
例如:
```java
int[] a = new int[4];//推介使用int[] 这种方式初始化
int c[] = {23,43,56,78};//长度：4，索引范围：[0,3]
```
List—是一个有序的集合，可以包含重复的元素，提供了按索引访问的方式，它继承Collection。
List有两个重要的实现类：ArrayList和LinkedList
ArrayList: 可以看作是能够自动增长容量的数组
ArrayList的toArray方法返回一个数组
ArrayList的asList方法返回一个列表
ArrayList底层的实现是Array, 数组扩容实现
LinkList是一个双链表,在添加和删除元素时具有比ArrayList更好的性能.但在get与set方面弱于
ArrayList.当然,这些对比都是指数据量很大或者操作很频繁
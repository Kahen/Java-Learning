package base.chapter05;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-07 19:08
 * instanceof 严格来说是Java中的一个双目运算符，用来测试一个对象是否为一个类的实例，用法为：
 * boolean result = obj instanceof Class
 * 其中 obj 为一个对象，Class 表示一个类或者一个接口，当 obj 为 Class 的对象，或者是其直接或
 * 间接子类，或者是其接口的实现类，结果result 都返回 true，否则返回false。
 * 注意：编译器会检查 obj 是否能转换成右边的class类型，如果不能转换则直接报错，如果不能确定
 * 类型，则通过编译，具体看运行时定
 */
public class TestInstanceof {
    public static void main(String[] args){
        int i=0;
        // System.out.println(i instanceof Integer);Inconvertible types; cannot cast 'int' to 'java.lang.Integer'
        // System.out.println(i instanceof Object);Inconvertible types; cannot cast 'int' to 'java.lang.Object'
        Integer integer=new Integer(1);
        /*编译通过*/
        System.out.println(integer instanceof Integer);
        //false ,在 JavaSE规范 中对 instanceof 运算符的规定就是：如果 obj 为 null，那么将返回false。
        System.out.println(null instanceof Object);
    }
}

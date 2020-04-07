package base.chapter06;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-07 19:36
 * 装箱就是自动将基本数据类型转换为包装器类型（int-->Integer）；调用方法：Integer的
 * valueOf(int) 方法
 * 拆箱就是自动将包装器类型转换为基本数据类型（Integer-->int）。调用方法：Integer的intValue方
 * 法
 */
public class Test01 {
    public static void main(String[] args){
        Integer i1=100;
        Integer i2=100;
        Integer i3=200;
        Integer i4=200;
        System.out.println(i1==i2);
        System.out.println(i3==i4);
        /**
         * 输出：
         * true
         * false
         * 为什么会出现这样的结果？输出结果表明i1和i2指向的是同一个对象，而i3和i4指向的是不同的对象。此
         * 时只需一看源码便知究竟，下面这段代码是Integer的valueOf方法的具体实现
         *
         */
        /*public static Integer valueOf(int i) {
            if(i >= -128 && i <= IntegerCache.high)
                return IntegerCache.cache[i + 128];
            else
                return new Integer(i);
        }*/
        Double d1 = 100.0;
        Double d2 = 100.0;
        Double d3 = 200.0;
        Double d4 = 200.0;
        System.out.println(d1==d2);
        System.out.println(d3==d4);
        /**
         * 运行结果：
         * false
         * false
         * 原因：在某个范围内的整型数值的个数是有限的，而浮点数却不是。
         */
    }
}

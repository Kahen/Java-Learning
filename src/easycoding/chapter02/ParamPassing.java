package easycoding.chapter02;

import java.io.PrintStream;
import java.util.LinkedList;


/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-24 14:52
 * 参数：
 * 形参实在方法定义阶段，而实参是在方法调用阶段，先来看看实参传递给形参的过程
 */
public class ParamPassing {
    private static int intStatic = 222;
    private static String stringStatic = "old string";
    private static StringBuilder stringBuilderStatic = new StringBuilder("old stringBuilder");

    public static void main(String[] args) {

        // 实参调用
        method(intStatic);
        method(stringStatic);
        method(stringBuilderStatic, stringBuilderStatic);

        // 输出依然是222（第一处）
        System.out.println(intStatic);
        method();

        // 无参方法调用之后，反而修改为888（第2处）
        System.out.println(intStatic);
        // 输出依然是：old string
        System.out.println(stringStatic);
        // 输出结果参考下方分析
        System.out.println(stringBuilderStatic);
    }

    /**
     * A方法
     */
    public static void method(int intStatic) {
        intStatic = 777;
    }

    /**
     * B方法
     */
    public static void method() {
        intStatic = 888;
    }

    /**
     * C方法
     */
    public static void method(String stringStatic) {
        // String 是immutable对象，string没有提供任何方法用于修改对象
        stringStatic = "new string";

    }

    /**
     * D方法
     */
    public static void method(StringBuilder stringBuilderStatic1, StringBuilder stringBuilderStatic2) {
        // 直接使用参数引用修改对象（第三处）
        stringBuilderStatic1.append(".method.first-");
        stringBuilderStatic2.append("method.second-");

        // 引用重新赋值
        stringBuilderStatic1 = new StringBuilder("new stringBuilder");
        stringBuilderStatic1.append("new method's append");
    }
    

}

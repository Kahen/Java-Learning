package base.chapter03;

import java.util.Arrays;

/**
 *
 * @author Kahen
 * @version 1.0
 * @date 2020-04-06 16:03
 * 基本数据类型在声明时系统会自动给它分配空间，而引用类型声明时只是分配了引用空间，必须
 * 通过实例化开辟数据空间之后才可以赋值。数组对象也是一个引用对象，将一个数组赋值给另一个数组
 * 时只是复制了一个引用，所以通过某一个数组所做的修改在另一个数组中也看的见。
 */
public class Test02 {
    public static void main(String[] args){
        int[] a={1,2,3};
        int[] b;
        b=a;
        System.out.println("a变化前地址:"+a);
        System.out.println("a变化前数值:"+ Arrays.toString(a));
        System.out.println("b变化前地址:"+b);
        System.out.println("b变化前地址:"+Arrays.toString(b));
        System.out.println("----- ----- ----- -----");
        a[1]=4;
        System.out.println("a变化后地址:"+a);
        System.out.println("a变化后数值:"+Arrays.toString(a));
        System.out.println("b变化后地址:"+b);
        System.out.println("b变化后地址:"+Arrays.toString(b));
        System.out.println("*******************如果b变了********************");
        b[0]=0;
        System.out.println("a变化后地址:"+a);
        System.out.println("a变化后数值:"+Arrays.toString(a));
        System.out.println("b变化后地址:"+b);
        System.out.println("b变化后地址:"+Arrays.toString(b));
    }
}

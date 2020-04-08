package base.chapter07;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-08 17:20
 * 在一个类中，同名的方法如果有不同的参数列表（参数类型不同、参数个数不同甚至是参数顺序不同）
 * 则视为重载。同时，重载对返回类型没有要求，可以相同也可以不同，但不能通过返回类型是否相同来
 * 判断重载。
 *
 * 重载 总结：
 * 1.重载Overload是一个类中多态性的一种表现
 * 2.重载要求同名方法的参数列表不同(参数类型，参数个数甚至是参数顺序)
 * 3.重载的时候，返回值类型可以相同也可以不相同。无法以返回型别作为重载函数的区分标准
 */
public class Father2 {

    public void say(){
        System.out.println("hello");

    }
    public void say(String name)
    {
        System.out.println("hello"+name);
    }
    public static void main(String[] args){
        Father2 s=new Father2();
        s.say();
        s.say("Kahen");
    }
}

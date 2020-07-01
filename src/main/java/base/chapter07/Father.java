package base.chapter07;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-08 17:11
 * 重载和重写的区别
 */
public class Father {
    /**
     * 重写(Override)
     * 从字面上看，重写就是 重新写一遍的意思。其实就是在子类中把父类本身有的方法重新写一遍。子类继
     * 承了父类原有的方法，但有时子类并不想原封不动的继承父类中的某个方法，所以在方法名，参数列
     * 表，返回类型(除过子类中方法的返回值是父类中方法返回值的子类时)都相同的情况下， 对方法体进行
     * 修改或重写，这就是重写。但要注意子类函数的访问修饰权限不能少于父类的
     */
    public static void main(String[] args){
        Son son=new Son();
        son.sayHello();
    }
    public  void sayHello(){
        System.out.println("Hello");
    }
}
class Son extends Father{
    @Override
    public void sayHello() {
        System.out.println("hello by");
    }
}
/**
 *重写 总结：
 * 1.发生在父类与子类之间
 * 2.方法名，参数列表，返回类型（除过子类中方法的返回类型是父类中返回类型的子类）必须相同
 * 3.访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private)
 * 4.重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常
 */


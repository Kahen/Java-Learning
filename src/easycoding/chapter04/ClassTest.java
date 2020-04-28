package easycoding.chapter04;

import java.lang.reflect.Field;
import java.net.URL;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-28 15:59
 */
public class ClassTest {
    // 数组类型有一个魔法属性：length 来获取数组长度
    private static int[] array = new int[3];
    private static int length = array.length;

    // 任何小写的class定义的类，也有一个魔法属性：class，来获取此类的大写Class类对象
    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        //    通过newInstance方法创建One和Another的类对象
        One oneObject = one.newInstance();
        oneObject.call();

        Another anotherObject = another.newInstance();
        anotherObject.speak();

        // 通过one这个大写的Class对象，获取私有成员属性对象Field
        Field privateFieldOne = one.getDeclaredField("inner");

        // 设置私有对象可以访问和修改
        privateFieldOne.setAccessible(true);

        privateFieldOne.set(oneObject, "World Changed");
        // 成功修改该类的私有属性inner变量值为world changed
        System.out.println(oneObject.getInner());

        //查看本地类加载器
        ClassLoader c=ClassTest.class.getClassLoader();
        ClassLoader c1=c.getParent();
        ClassLoader c2=c1.getParent();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        //查看Bootstrap所有已经加载的类库
        URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }
    }
}

class One {
    private String inner = "time files.";

    public void call() {
        System.out.println("Hello World");
    }

    public String getInner() {
        return inner;
    }

}

class Another {

    public void speak() {
        System.out.println("easy coding.");
    }

}

package base.chapter06;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-06 15:50
 * int是基本数据类型，Integer是int的封装类，是引用类型。int默认值是0，而Integer默认值是
 * null，所以Integer能区分出0和null的情况。一旦java看到null，就知道这个引用还没有指向某个对象，
 * 再任何引用使用前，必须为其指定一个对象，否则会报错。
 */
public class Test01 {
        int i;
        Integer j;
    public static void main(String[] args){
        Test01 test01=new Test01();
       test01.go();
    }
    public void go(){
        // j=i;
        System.out.println(j==i);
        System.out.println(i);
    }
}

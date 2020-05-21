package easycoding.chapter06;

/**
 * @author: Kahen
 * @time: 2020/5/21 12:27
 */

import java.util.ArrayList;
import java.util.List;

public class AnimalCatGarfield {
    public static void main(String[] args){

        // 第一段：声明三个一次继承的类的集合：<Object>动物>猫>咖啡猫
        List<Animal> animal = new ArrayList<Animal>();
        List<Cat> cat = new ArrayList<Cat>();
        List<Garfield> garfield = new ArrayList<Garfield>();

        animal.add(new Animal());
        cat.add(new Cat());
        garfield.add(new Garfield());

        // 第2段；测试复制操作
        // 下行编译出错。只能复制Cat或Cat子类的集合
        // List<? extends Cat> extendsCatFromAnimal=animal;
        List<? super Cat> superCatFromAnimal = animal;

        List<? extends Cat> extendsCatFromCat = cat;
        List<? super Cat> superCatFromCat = cat;

        List<? extends Cat> extendsCatFromGarfield = garfield;
        // List<? super Cat> superCatFromGarfield=garfield;

        // 第3段：测试 add 方法
        // 下面三行所有<? extends T> 都无法进行add操作，编译均出错
        // extendsCatFromCat.add(new Animal());
        // extendsCatFromCat.add(new Cat());
        // extendsCatFromCat.add(new Garfield());

        // 第4段：测试get方法
        // 所有的super操作能够返回元素，但是泛型丢失，只能返回Object对象

        // 以下extends操作能够返回元素
        Object catExtends2 = extendsCatFromCat.get(0);
        Cat catExtends1 = extendsCatFromCat.get(0);
        //下行编译出错，虽然Cat集合从Garfield赋值而来，但是类型擦除后，是不知道的
        // Garfield garfield1=extendsCatFromGarfield.get(0);
    }
}

class Animal {
}

class Cat extends Animal {
}

class Garfield extends Cat {
}
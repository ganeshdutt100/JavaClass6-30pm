package OPPS;


abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("The animal is sleeping");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks");
    }
   public void koibhi() {
        System.out.println("koibhi");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("The cat meeeeeeeooooooowwwwwww");
    }
}


public class AbstractClass1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog dog1 = new Dog();
        Animal cat = new Cat();


        dog.sound();
        dog.sleep();
        dog1.koibhi();

        cat.sound();
        cat.sleep();
    }
}

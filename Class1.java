public class Class1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();  // Inherited from Animal class
        myDog.bark(); // Defined in Dog class
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The Dog barks");
    }
}

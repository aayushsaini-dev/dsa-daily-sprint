public class Inheritance {
    public static void main(String args[]) {
        Dog labraDog = new Dog();
        labraDog.eat();
        labraDog.walk();
        labraDog.legs = 4;
        System.out.println(labraDog.legs);

        fish shark = new fish();
        shark.eat();
        shark.swim();

        horse h = new horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();

    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("walks on a surface");
    }
}

class Dog extends Mammal {
    String breed;
}

// abstract classes
abstract class animal2 {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends animal2 {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chicken extends animal2 {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

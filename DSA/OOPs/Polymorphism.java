public class Polymorphism {
    public static void main(String args[]) {
        // function overloading
        calculator calc = new calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(1, 2, 5));
        // function overriding
        Deer d = new Deer();
        d.eat();
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
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

// derived class
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass only!");
    }
}

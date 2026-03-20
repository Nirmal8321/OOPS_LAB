// LAB_6 Q1 - super and this: refer to super member, call super constructor
class A {
    int x = 10;
    A() { System.out.println("A()"); }
    A(int x) { this.x = x; System.out.println("A(int)"); }
}

class B extends A {
    int x = 20;
    B() {
        super();  // call super class constructor
        System.out.println("B()");
    }
    B(int x) {
        super(x);  // call super class constructor with arg
        System.out.println("B(int)");
    }
    void show() {
        System.out.println("this.x (subclass): " + this.x);
        System.out.println("super.x (superclass): " + super.x);  // refer to super member
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
        B b2 = new B(5);
        b2.show();
    }
}

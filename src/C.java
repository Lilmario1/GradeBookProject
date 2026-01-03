package GradeBook;

// Use unique names so they don't clash with B.java
class A6 {
    A6() {
        System.out.println("A");
    }
}

class B6 extends A6 {
    public B6() {
        System.out.println("B");
    }
}

public class C extends B6 {
    public C() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();   // prints: A, B, C
    }
}






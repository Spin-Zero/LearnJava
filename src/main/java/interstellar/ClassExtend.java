package interstellar;

class  A {
    A() {
        System.out.println("Class A constructed.");
    }
}

class B {
    B() {
        System.out.println("Class B constructed.");
    }
}

class C extends A {
    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}
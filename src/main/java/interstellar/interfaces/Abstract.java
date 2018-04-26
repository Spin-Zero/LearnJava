package interstellar.interfaces;

abstract class NoMethods {}

class Child1 extends NoMethods {
    public static void func() {
        System.out.println("Child1.func()");
    }
}

abstract class WithMethods {
    abstract public void func();
}

class Child2 extends WithMethods {
    public void func() {
        System.out.println("Child2.func()");
    }
}

/**
 * Abstract
 */
public class Abstract {
    public static void test1(NoMethods nm) {
        ((Child1) nm).func();
    }

    public static void test2(WithMethods wm) {
        wm.func();  
    }

    public static void main(String[] args) {
        WithMethods wm = new Child2();
        test2(wm);
        NoMethods nm = new Child1();
        test1(nm);
    }
}
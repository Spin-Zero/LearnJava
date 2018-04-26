package interstellar;

class WithFinals {
    void f() {
        System.out.print("WithFinals.f()");
    }
}

/**
 * OverridingPrivate
 */
public class OverridingPrivate extends WithFinals {
    
    @Override
    protected void f() {
        System.out.print("OverridingPrivate.f()");
    }

    public static void main(String[] args) {
        OverridingPrivate aaa = new OverridingPrivate();
        aaa.f();
    }
}
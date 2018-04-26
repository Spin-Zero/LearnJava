package interstellar;

class Poppet {
    Poppet() {
        System.out.print("Poppet()");
    }
}

/**
 * BlankFinal
 */
public class BlankFinal {

    private final Poppet p;
 
    public BlankFinal() {
        p = new Poppet();
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}

package interstellar;

import net.mindview.util.Print;

class Soup {
    private String s;

    Soup() {
        System.out.println("Soup()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

/**
 * Bath
 */
public class Bath {

    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soup castille;
    private int i;
    private float f;

    public Bath() {
        Print.print("Inside Bath()");
        s3 = "Joy";
        f = 3.14f;
        castille = new Soup();
    }

    {
        i = 47;
    }

    public String toString() {
        if (s4 == null) {
            s4 = "joy";
        }
        return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s4 + "\n" + "i = " + i + "\n"
                + "f = " + f + "\n" + "castille  " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        Print.print(b);
    }
}

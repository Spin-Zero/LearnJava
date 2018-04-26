package interstellar.reflection;

import static net.mindview.util.Print.*;

/**
 * GetRange
 */
public class Classes {

    static String className = "interstellar.Bath";

    public static void main(String[] args) {
        try {
            Class cl = Class.forName(className);   
            print(cl.getName());
        } catch(ClassNotFoundException e) {
            print("could't found Bath.");
        }
    } 
}
package interstellar;

import static net.mindview.util.Print.*;

import net.mindview.util.Range;

/**
 * StaticInitialization
 */
public class StaticInitialization {
    public void printStr(String...args) {
        for (String str: args) {
            printnb(str + " ");
        }
    }
    public static void main(String[] args) {
        StaticInitialization a = new StaticInitialization();
        a.printStr("1", "2", "3");
        a.printStr(new String[] {"a", "s", "d"});
    } 
}

class Table {
    Table(String str) {
        print(str);
    }
}
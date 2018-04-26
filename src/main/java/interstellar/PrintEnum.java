package interstellar;

import static net.mindview.util.Print.*;

/**
 * PrintEnum
 */
public class PrintEnum {

    public static void main(String[] args) {
        for (MoneyEnum m : MoneyEnum.values()) {
            print(m + " " + m.ordinal());
        }
    }
}
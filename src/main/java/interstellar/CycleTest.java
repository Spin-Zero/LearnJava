package interstellar;

import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

class Cycle {
    void ride() {
        print("cycle");
    }
}

class Unicycle extends Cycle {
    void ride(){
        print("Unicycle");
    }
}

class Bicycle extends Cycle {
    void ride() {
        print("Bicycle");
    }
}

class Tricycle extends Cycle {
    void ride() {
        print("Tricycle");
    }

    void riding() {
        print("Tricycle is riding.");
    }
}

/**
 * CycleTest
 */
public class CycleTest {

    static Cycle[] cycle = {
        new Cycle(),
        new Unicycle(),
        new Bicycle(),
        new Tricycle(),
    };
    public static void main(String[] args) {
        for (int i: range(4)) {
            cycle[i].ride();
        }
    }
}
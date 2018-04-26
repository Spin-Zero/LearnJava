package interstellar.interfaces;

import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

/**
 * Apply
 */
public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect.";

    public static void main(String[] args) {
        process(new Splitter(), s);
    }


}
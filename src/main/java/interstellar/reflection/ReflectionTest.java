package interstellar.reflection;

import static net.mindview.util.Print.*;
import java.util.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ReflectionTest
 */
public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        }
        else {
            Scanner in = new Scanner(System.in);
            print("Enter class name (e.g java.util.Date):");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                print("cl.modifiers: " + modifiers);
            }
            print("class: " + name);
            if (supercl != null && supercl != Object.class) {
                print("extends: " + supercl.getName());
            }
            
            print("\n{\n");
            print("Constructors of cl: ");
            printConstructors(cl);
            print("Methods of cl");
            printMethods(cl);
            print("Fields of cl");
            printFields(cl);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Print all constructors of a class
     * @param cl a class
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c: constructors) {
            String name = c.getName();
            print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                print("Constructor的modifier: " + modifiers);
            }
            print("Constructor的name: " + name);

            //Print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    print(", ");
                }
                print("ParameterType.name: " + paramTypes[j].getName());
                
            }
            print(");");
        }
        
    }

    /**
     * Prints all methods of a class
     * @param cl a class
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            print(" ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                print(modifiers + " ");
            }
            print("return type : " + retType.getName() + " " + "method name: " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    print(", ");
                }
                print("Method parameter type: " + paramTypes[j].getName());
            }
            print(");");
        }
        
    }

    /**
     * Prints all fields of aclass
     * @param cl a class
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f: fields) {
            Class type = f.getType();
            String name = f.getName();
            print(" ");
            String modifiers =  Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                print("Field modifier: " + modifiers + " ");

            }
            print("Field type: " + type.getName() + " " + "Field name: " + name + ";");
            
        }
    }
}




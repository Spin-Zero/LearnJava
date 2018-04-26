package interstellar;

import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;
import java.util.Arrays;

//列出Febonacci数列
class Febonacci {
    int height;
    int a = 0;
    int b = 1;

    Febonacci(int num) {
        height = num;
    }

    public void getFebonacci() {
        for (int i : range(height)) {
            int c = a + b;
            print(c);
            a = b;
            b = c;
        }
    }

}

//找出四位数的吸血鬼数字
class XiXueGui {
    String[] targetArray = null;
    String[] originalArray = null;
    int sum = 0;
    int count = 0;

    public void getXiXueGui() {
        for (int i : range(10, 100)) {
            for (int j : range(i, 100)) {
                count++;
                int target = i * j;
                if (target > 9999) {
                    continue;
                }
                targetArray = String.valueOf(target).split("");
                originalArray = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(targetArray);
                Arrays.sort(originalArray);
                if (Arrays.equals(originalArray, targetArray)) {
                    sum++;
                    print("第 " + sum + "个:" + target + " " + i + "*" + j);
                }
            }
        }
        print("共进行了" + count + "次查找,找到" + sum + "个吸血鬼数字");
    }
}

class Flower {
    int count = 0;
    String str = "initial valued";

    Flower(int cnt) {
        count = cnt;
        print("Counstructor w/ int arg only, count= " + count);
    }

    Flower(String ss) {
        str = ss;
        print("Constructor w/ String arg only, s= " + str);
    }

    Flower(String s, int petals) {
        this(petals);
        this.str = s;
    }
}

class Tank {
    boolean full = false;

    Tank(boolean state) {
        full = state;
        print("New tank was created.");
    }

    void empty() {
        full = false;
    }

    protected void finalize() {
        if (full) {
            print("The state of tank must be empty");
        }
    }
}

class Depth {
}

public class App {
    public static void main(String[] args) {
        Depth d = new Depth();
    }
}
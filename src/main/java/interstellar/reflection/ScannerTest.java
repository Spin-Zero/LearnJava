package interstellar.reflection;

import java.util.Scanner;
import static net.mindview.util.Print.*;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("请输入第一个字符串");
        String a = sc.next();
        print("请输入第二个字符串");
        String b = sc.next();
        print(a + b);
    }
}

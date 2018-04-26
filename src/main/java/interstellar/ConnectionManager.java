package interstellar;

import java.sql.Connection;

import static net.mindview.util.Print.*;

/**
 * ConnectionManager
*/

class AAA extends Cycle {
    
}
public class ConnectionManager {
    
    private static Connection connects[];

    public static Connection aaa() {
        return connects[0];
    } 

    public static void main(String[] args) {
        print(ConnectionManager.aaa());
    }
}
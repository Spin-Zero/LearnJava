package interstellar.io;

import java.io.*;

/**
 * Box
 */
public class Box implements Serializable {

    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setHeight(20);
        myBox.setWidth(50);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("foo.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Box yourBox = (Box) oi.readObject();
            System.out.println(yourBox.height);
            System.out.println(yourBox.width);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}
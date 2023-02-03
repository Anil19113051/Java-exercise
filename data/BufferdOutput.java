package data;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferdOutput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                    new FileOutputStream("C:\\Users\\Anilchowdary\\JavaWorkspace\\data\\NewData.txt");

            //Creating BufferedOutputStream object.
            BufferedOutputStream bos =
                    new BufferedOutputStream(fos);

            bos.close();
            System.out.println("Anil is a big fan of Magesh Babu");
        } catch (Exception e) {
            System.out.println("Ioexception:" + e.getMessage());
        }
    }
}

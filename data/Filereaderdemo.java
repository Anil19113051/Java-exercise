package data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Filereaderdemo {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Anilchowdary\\JavaWorkspace\\data\\data.txt");
            System.out.println("reading");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (FileNotFoundException fe) {
            System.out.println("fileNotfoundexception: " + fe.getMessage());
        } catch (IOException ie) {
            System.out.println("IOexception: " + ie.getMessage());
        }
    }

}

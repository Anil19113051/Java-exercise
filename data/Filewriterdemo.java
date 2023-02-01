package data;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Filewriterdemo {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("C:\\Users\\Anilchowdary\\JavaWorkspace\\data\\data.txt");
            fw.write("Raj is a Good frnd for Anil");
            fw.close();
            System.out.println("writting");
        } catch (FileNotFoundException fe ) {
            System.out.println("fileNotfoundexception: " + fe.getMessage());
        }catch (IOException ie) {
            System.out.println("IOexception: " + ie.getMessage());
    }


 }


}

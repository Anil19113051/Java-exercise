package data;
import java.util.ArrayList;
import java.util.List;
public class ArrayListdemo {
    public static void main(String[] args) {
        try {
            List arraylist = new ArrayList<String>();
            arraylist.add("Anil");
            arraylist.add("Pavan");
            arraylist.add("Maruthi");
            arraylist.add("Trinesh");
            arraylist.add("Raju");
            List secondArrayList = new ArrayList();
            secondArrayList.add(arraylist);
            System.out.println("second arraylist-" + secondArrayList.size());
            System.out.println("contents of second arraylist-" + secondArrayList);
            System.out.println("second contain all-" + secondArrayList.containsAll(arraylist));
            secondArrayList.add("newitem");
            System.out.println(arraylist);
            System.out.println(arraylist.size());
            System.out.println((arraylist.contains("Maruthi")) ? "true" : "flase");
            System.out.println(arraylist.remove("Raju"));
            System.out.println(arraylist.size());
            System.out.println((arraylist.contains("Pavan")) ? "true" : "flase");
            System.out.println((arraylist.get(0)));
            System.out.println(arraylist.get(2));
            System.out.println("Demostrating is Empty: " + arraylist.isEmpty());
            arraylist.clear();
            System.out.println("post clearing the arrayList" + arraylist.size());
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Index out of box" + ie.getMessage());
        }
        System.out.println("Executed Successfully");
    }
}



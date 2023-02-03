package data;
import java.util.LinkedList;
public class LinkedlistDemo {
    public static void main(String[] args) {

            LinkedList<String> ll=new LinkedList<String>();
            System.out.println("Initial list of elements: "+ll);
            ll.add("Super star");
            ll.add("Power star");
            ll.add("NTR");
            ll.add("sampurnesh Babu");
            System.out.println("Cinima "+ll);
            //Adding an element at the specific position
            ll.add(1, "NTR");
            System.out.println("Actor "+ll);
            LinkedList<String> ll2=new LinkedList<String>();
            ll2.add("MGR");
            ll2.add("Kamal Hassan");
            //Adding second list elements to the first list
            ll.addAll(ll2);
            System.out.println("Cinima "+ll);
            LinkedList<String> ll3=new LinkedList<String>();
            ll3.add("Ajith Kumar");
            ll3.add("Thalapathy");
            //Adding second list elements to the first list at specific position
            ll.addAll(1, ll3);
            System.out.println("Cinima "+ll);
            //Adding an element at the first position
            ll.addFirst("Ram caharan");
            System.out.println("Hero: "+ll);
            //Adding an element at the last position
            ll.addLast("viyaya Kaanth");
            System.out.println("Actor"+ll);

        }
}

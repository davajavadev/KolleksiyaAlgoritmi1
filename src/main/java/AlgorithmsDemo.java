import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(new Integer(-8));
        ll.add(new Integer(20));
        ll.add(new Integer(-20));
        ll.add(new Integer(8));

        Comparator r = Collections.reverseOrder();

        Collections.sort(ll,r);

        Iterator li = ll.iterator();
        System.out.println("Kattasidan kichikka  qarab tartib : ");
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }

        System.out.println();
        Collections.shuffle(ll);

        li = ll.iterator();
        System.out.println("Tartibsiz ro'yxat");
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }

        System.out.println();

        System.out.println("Minimum " + Collections.min(ll));
        System.out.println("Maximum " + Collections.max(ll));


    }
}

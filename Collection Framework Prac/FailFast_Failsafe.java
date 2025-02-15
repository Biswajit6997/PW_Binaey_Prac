/*
 Failfast and failSafe in Java


 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast_Failsafe {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(200);
        al.add(300);
        System.out.println(al);
        // Fail Fast
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            // al.add(100);// It will give ConcurrentModificationException error
        }

        // Fail Safe

        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();

        al1.add(10);
        al1.add(20);
        al1.add(100);
        al1.add(150);
        System.out.println(al1); // [10, 20, 100, 150]
        System.out.println("................................................................");

        Iterator itr1 = al1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            al1.add(100);// It will run without error but not add in the list --> Fail Safe
        }

    }

}

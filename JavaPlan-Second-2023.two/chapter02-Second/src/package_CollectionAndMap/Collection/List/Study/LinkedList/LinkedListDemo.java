package package_CollectionAndMap.Collection.List.Study.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList person1 = new LinkedList();
        for (int a = 0; a < 100; a++) {
            person p1 = new person("zhangsan"+a, 18);
            person1.add(p1);
        }

        Iterator iterator = person1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object J : person1) {
            System.out.println(J);
        }


    }


}

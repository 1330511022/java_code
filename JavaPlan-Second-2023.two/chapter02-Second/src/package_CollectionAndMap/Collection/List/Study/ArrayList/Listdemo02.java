package package_CollectionAndMap.Collection.List.Study.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 0) {
                list.add(i);

            }
        }
        System.out.print(list);
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n % 6 == 0) {
                iterator.remove();
            }
        }
        System.out.print(list);



    }
}

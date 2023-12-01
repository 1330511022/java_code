package package_CollectionAndMap.Collection.Set.SetWork;

import java.util.*;

public class DaLeTou {
    public static void main(String[] args) {
        Random rand = new Random();
        TreeSet<Integer> s1 = new TreeSet<>();
        int n;
        for (n = 1; n < 6; n++) {
            s1.add(rand.nextInt(35) + 1);
        }
        while (s1.size() < 5) {
            s1.add(rand.nextInt(35) + 1);
        }

        TreeSet<Integer> s2 = new TreeSet<>();
        for (n = 5; n < 7; n++) {
            int num = rand.nextInt(12) + 1;
            while (s1.contains(num)) {
                num = rand.nextInt(12) + 1;
            }
            s2.add(num);
        }
        System.out.println("前区数字：" + s1);
        System.out.println("后区数字:" + s2);
        ArrayList<Object> all = new ArrayList<>();
        all.addAll(s1);
        all.addAll(s2);
        System.out.println("全部数字：" + all);

    }

}
package package_CollectionAndMap.Collection.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        // TreeSet中依次添加13、8、17、17、1、11、15、25元素
        treeSet.add(13);
        treeSet.add(8);
        treeSet.add(17);
        treeSet.add(17);
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(15);
        treeSet.add(25);
        System.out.println("treeSet集合中的数据为：" + treeSet);  // 默认升序排序[1, 8, 11, 13, 15, 17, 25]
        System.out.println(treeSet.lower(20));
        System.out.println(treeSet.pollLast());



    }


}

package package_CollectionAndMap.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetdemo {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("HuaWei");
        sites.add("Baidu");
        sites.add("Taobao");
        sites.add("Baidu");         // 重复的元素不会被添加
        sites.add("Sina");
        for (String i : sites) {
            System.out.println(i);
        }
        Iterator it = sites.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("列表的长度=" + sites.size());        // 结果为4
    }
}

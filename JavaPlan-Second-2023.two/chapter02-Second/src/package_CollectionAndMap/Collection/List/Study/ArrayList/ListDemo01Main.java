package package_CollectionAndMap.Collection.List.Study.ArrayList;

import java.util.ArrayList;

public class ListDemo01Main {
    public static void main(String[] args) {
        ListDemo p1 = new ListDemo("zhangsan",18);
        ListDemo p2 = new ListDemo("lisi",15);
        ListDemo p3 = new ListDemo("wangwu",12);
        ListDemo p4 = new ListDemo("liuliu",31);
        ListDemo p5 = new ListDemo("xiaoming",25);
        ArrayList<ListDemo> list = new ArrayList<>();
        //泛型 list中只能放ListDemo对象
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        ListDemo D1 = (ListDemo) list.get(1);
        System.out.println(D1.getName());
        D1.speak();
        ListDemo D2 = list.remove(list.indexOf(p3));
        System.out.println(D2.getName());
        System.out.println(list);
    }
    
}


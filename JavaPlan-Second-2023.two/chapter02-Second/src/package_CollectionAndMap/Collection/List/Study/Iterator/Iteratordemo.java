package package_CollectionAndMap.Collection.List.Study.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

//当在迭代器运行种利用集合删除方式删除元素，迭代器会抛出异常
public class Iteratordemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("张三".equals(obj)) {
                //第一种方法 利用break跳出循环
                //list.remove(obj);
                //break;
                //第二种方法：利用迭代器中的删除
                it.remove();
            }
        }
        System.out.println(list);
    }
}

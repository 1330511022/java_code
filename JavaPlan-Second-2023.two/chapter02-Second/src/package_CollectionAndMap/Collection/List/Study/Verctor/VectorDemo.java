package package_CollectionAndMap.Collection.List.Study.Verctor;

import java.util.Vector;
//Vector容量测试   长度翻倍为1倍
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        System.out.println(vec.capacity());            // 结果为10
        for(int i=1; i<12;i++){
            vec.add(i);
        }
        System.out.println(vec.capacity());            // 结果为20
        for(int i=1; i<12;i++){
            vec.add(i);
        }
        System.out.println(vec.capacity());            // 结果为40
    }
}

package package_CollectionAndMap.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapdemo01 {
    public static void main(String[] args) {
        String Student [][] = {{"220431405","付佳瑶"},{"220431408","石银鑫"},{"220431424","孙浩"},
                {"220431426","张晶晶"},{"220431429","纪小花"},{"220431430","蒋严毅"},
                {"220431432","赵林峰"},{"220431434","陈佳谊"},{"220431436","韩宇琼"},
                {"220431501","马卓"},{"220431502","孔丹栋"},{"220431507","史晓蓉"},
                {"220431510","白海龙"},{"220431511","白贺强"},{"220431514","何奇昌"},
                {"220431519","周诗凯"},{"220431520","芦志鹏"},{"220431528","张姣姣"},
                {"220431531","杨超群"},{"220431534","陈润凯"},{"220431535","韩玲玉"},{"220431601","马飞儿"},
                {"220431603","马智博"},{"220431604","牛压文"},{"220431605","王云鹏"},{"220431606","王泽恺"},
                {"220431608","左烨琦"},{"220431610","刘明乐"},{"220431617","李晨晨"},{"220431624","罗明凤"},
                {"220431625","侯垚"},{"220431626","侯嘉怡"},{"220431631","蔡怡君"},{"220431633","张晓涛"},{"220431636","韩雪"}};
        Map<String,String> hashMap = new HashMap();
        for (int i  = 0 ; i<Student.length;i++) {
            hashMap.put(Student[i][0],Student[i][1]);
        }
                //tryset传入方法
        Set set = hashMap.keySet();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
           String i =iterator.next();
            System.out.println(i + hashMap.get(i));
        }
    }
}

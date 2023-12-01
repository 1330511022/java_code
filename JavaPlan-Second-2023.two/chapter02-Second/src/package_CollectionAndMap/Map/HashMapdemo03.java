package package_CollectionAndMap.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapdemo03 {
    public static void main(String[] args) {
        String[][] Student = {{"220431405", "付佳瑶"}, {"220431408", "石银鑫"}, {"220431424", "孙浩"},
                {"220431426", "张晶晶"}, {"220431429", "纪小花"}, {"220431430", "蒋严毅"},
                {"220431432", "赵林峰"}, {"220431434", "陈佳谊"}, {"220431436", "韩宇琼"},
                {"220431501", "马卓"}, {"220431502", "孔丹栋"}, {"220431507", "史晓蓉"},
                {"220431510", "白海龙"}, {"220431511", "白贺强"}, {"220431514", "何奇昌"},
                {"220431519", "周诗凯"}, {"220431520", "芦志鹏"}, {"220431528", "张姣姣"},
                {"220431531", "杨超群"}, {"220431534", "陈润凯"}, {"220431535", "韩玲玉"}, {"220431601", "马飞儿"},
                {"220431603", "马智博"}, {"220431604", "牛压文"}, {"220431605", "王云鹏"}, {"220431606", "王泽恺"},
                {"220431608", "左烨琦"}, {"220431610", "刘明乐"}, {"220431617", "李晨晨"}, {"220431624", "罗明凤"},
                {"220431625", "侯垚"}, {"220431626", "侯嘉怡"}, {"220431631", "蔡怡君"}, {"220431633", "张晓涛"}, {"220431636", "韩雪"}};

        //treemap------升序排序
        //重写比较器方法
        //降序排序
        /*当返回值小于0时，TreeSet将 x 放在 y 之前；
          当返回值大于0时，TreeSet将 y 放在 x 之前;
          当返回值等于0时，TreeSet保持 x 和 y 的位置不变。
        */
        Map<String, String> stuMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                if (x.compareTo(y) < 0) {
                    return 1;
                } else if (x.compareTo(y) > 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < Student.length; i++) {
            stuMap.put(Student[i][0], Student[i][1]);
        }
        System.out.println(stuMap);
    }
}

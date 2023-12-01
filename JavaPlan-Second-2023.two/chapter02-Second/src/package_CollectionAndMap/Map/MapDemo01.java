package package_CollectionAndMap.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1001", "张三");
        map.put("1002", "李四");
        map.put("1003", "王五");
        map.put("1004", "赵六");

        System.out.println(map);
        Set set = map.keySet();
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String k = it.next();
            System.out.println(k + ":" + map.get(k));
        }
        System.out.println("*********************************************************************8*********");
        Map<String, Float> fruitsMap = new HashMap<>();
        fruitsMap.put("苹果", 5f);
        fruitsMap.put("香蕉", 3.5f);
        fruitsMap.put("菠萝", 6f);
        fruitsMap.put("西瓜", 1.5f);
        fruitsMap.put("香蕉", 5.5f);
        System.out.println(fruitsMap);    // {苹果=5.0, 香蕉=5.5, 西瓜=1.5, 菠萝=6.0}
        // 获取Map.Entry类型的集合，即fruitsMap中的所有映射关系形成的集合
        Set entrySet = fruitsMap.entrySet();
        System.out.println(entrySet);    // [苹果=5.0, 香蕉=5.5, 西瓜=1.5, 菠萝=6.0]
        Iterator<Map.Entry> it1 = entrySet.iterator();
        while (it1.hasNext()) {
            Map.Entry entry = it1.next();
            System.out.println(entry.getKey() + "的价格为：" + entry.getValue());
        }
    }
}




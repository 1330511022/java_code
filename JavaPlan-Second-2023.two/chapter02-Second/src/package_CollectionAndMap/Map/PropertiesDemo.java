package package_CollectionAndMap.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + ("/db.properties")));
        properties.load(bufferedReader);
        // 获取key对应的value值
        Enumeration<?> names = properties.propertyNames();
        while (names.hasMoreElements()) {
            String key = (String) names.nextElement();
            System.out.println(key + ":" + properties.getProperty(key));
        }
    }


}


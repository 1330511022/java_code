package API.package_SystemAndRuntimeAPI;

import java.util.Enumeration;
import java.util.Properties;

//- 获取系统属性

public class SystemDemo03 {
    public static void main(String[] args){
        Properties properties = System.getProperties();
        System.out.println((properties));
        Enumeration propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()){
            String key = (String)propertyNames.nextElement();
            System.out.println(key + "=" + System.getProperty(key));
        }
    }
}

package API.package_SystemAndRuntimeAPI;
//- 获取虚拟机相关的信息
public class RuntimeDemo01 {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("JVM空闲内存大小：" + runtime.freeMemory());
        System.out.println("JVM最大可用内存：" + runtime.maxMemory());
        System.out.println("JVM处理器个数：" + runtime.availableProcessors());
        System.out.println("JVM内存总量：" + runtime.totalMemory());
    }

}

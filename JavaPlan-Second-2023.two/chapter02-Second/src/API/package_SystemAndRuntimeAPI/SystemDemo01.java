package API.package_SystemAndRuntimeAPI;
//- 数组拷贝
public class SystemDemo01 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        arr2[0] = 100;
        arr2[1] = 200;
        System.out.println("arr2数组元素初始值：");
        for(int n : arr2){
            System.out.print(n + " ");
        }
        System.arraycopy(arr1,0,arr2,2,3);
        System.out.println("\narr2数组元素的最新值为：");
        for(int n : arr2){
            System.out.print(n + " ");
        }

    }
}

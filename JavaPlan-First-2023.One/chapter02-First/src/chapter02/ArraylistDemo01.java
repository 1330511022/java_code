/*
 * 如果在定义数组时，无法确定数组的长度，我们也可以使用数组列表ArrayList来声明一个任意长度的动态数组。
ArrayList的使用步骤：

（1）导入java.util中的ArrayList类：import java.util.ArrayList
（2）声明ArrayList类的对象，例如：ArrayList<String> fruits = new ArrayList<>();
声明ArrayList类的对象后，就可以使用以下方法对动态数组进行操作了。
（1）add() ：在数组末尾添加元素
（2）addAll()：添加所有元素
（3）get()： 根据索引值获取元素
（4）indexOf() ：根据元素返回索引值
（5）lastIndexOf() ：返回指定元素在ArrayList中最后一次出现的位置
（6）remove() ：删除单个元素
（7）removeIf()： 删除满足指定条件的所有元素
（8）subList() ：截取指定索引区间内的元素，与clear()配合使用可以删除区间内的元素
（9）removeAll()： 删除所有元素。不常用，一般用clear()方法
（10）size() ：返回ArrayList的元素数量
（11）set()：替换指定索引元素
（12）isEmpty()：判断是否为空
（13）clone()：拷贝一份动态数组，属于浅拷贝
（14）sort()： 排序
（15）toArray()：将ArrayList转化为普通数组
（16）toString()：将ArrayList转化为字符串
//详细内容请仔细阅读飞书讲义
*/
package chapter02;
import java.util.ArrayList;
public class ArraylistDemo01 {
	public static void main(String[] args) {
		ArrayList<String> xingmin = new ArrayList<>(); //定义名为"xingmin"的动态数组
		ArrayList<String> name = new ArrayList<>();//定义名为"name"的动态数组
		xingmin.add("户玺文"); //添加元素---->xingmin
		name.add("何奇昌");//添加元素---->name
		name.add("张楠");//添加元素---->name
		xingmin.addAll(name);  //添加所有元素 将name中元素添加到xingmin中
		System.out.println(xingmin); //打印xingmin数组	
		System.out.println(xingmin.get(1)); // 根据索引值获取元素 (何奇昌在数组中的索引为 1 )
		System.out.println(xingmin.indexOf("张楠")); //根据索引值获取元素 （根据输出结果可知张楠在数组中的索引为 2）
		
	}

}

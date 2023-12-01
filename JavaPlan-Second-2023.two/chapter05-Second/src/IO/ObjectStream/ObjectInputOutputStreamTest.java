package IO.ObjectStream;

import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {
    @Test
    public void test1() throws IOException {
        //序列化过程：使用ObjectOutputStream实现将内存中的Java对象保存到文件中或通过网络传输出去
        File file1 = new File("object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file1));
        objectOutputStream.writeUTF("江山如此多娇,引无数英雄竞折腰");
        objectOutputStream.flush();
        objectOutputStream.writeObject("轻轻的我走了，正如我轻轻的来");
        objectOutputStream.flush();

        objectOutputStream.close();

    }
    @Test
    public void test2() throws IOException, ClassNotFoundException {
//        反序列化过程：使用ObjectInputStream实现 将文件中或网络传输过来的数据还原为内存中的Java对象
        File file2 = new File("object.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
        String s = objectInputStream.readUTF();
        String o = (String) objectInputStream.readObject();
        System.out.println(s);
        System.out.println(o);
        objectInputStream.close();

    }
    @Test
    public void test3() throws IOException, ClassNotFoundException {
//        演示自定义类对象的序列化和反序列化过程
        File file1 = new File("object1.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file1));
        Person tom = new Person("TOM", 12);
        objectOutputStream.writeObject(tom);
        objectOutputStream.flush();
        objectOutputStream.close();

    }
    @Test
    public void test3_1() throws IOException, ClassNotFoundException {
//        反序列化过程
        File file2 = new File("object1.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
        Person o = (Person) objectInputStream.readObject();
        System.out.println(o);

        objectInputStream.close();

    }


}

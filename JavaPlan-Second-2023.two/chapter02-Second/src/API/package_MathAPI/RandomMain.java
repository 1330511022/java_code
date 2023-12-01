package API.package_MathAPI;

import java.util.Random;
//临时代码  //重复， 0
public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        int[] n1 = new int[7];
        for (int i = 0; i < 5; i++) {
            n1[i] = random.nextInt(35) + 1;
        }
        for (int i = 5; i < 7; i++) {
            n1[i] = random.nextInt(12) + 1;
        }
        for (int x : n1) {
            System.out.print(x + " ");
        }

    }
}

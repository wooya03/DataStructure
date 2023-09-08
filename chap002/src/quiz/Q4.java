package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    static void copy(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 수 : ");
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        for(int i = 0; i < num; i ++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        copy(a, b);

        System.out.println("배열 a : " + Arrays.toString(a));
        System.out.println("배열 b : " + Arrays.toString(b));

        sc.close();
    }
}

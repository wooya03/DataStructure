package chap01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.print("a값: ");
        a = sc.nextInt();
        for(int i = 0; i <= 0; i++){
            System.out.print("b값: ");
            b = sc.nextInt();
            if(a>=b) {
                System.out.println("a보다 큰 값을 입력하세요!");
                i--;
            }         
        }
        System.out.printf("b - a는 %d입니다.\n", b- a);
        sc.close();
    }
}

package chap01;

import java.util.Scanner;

public class Q14 {
  static void traiangleLB(int n){
    for(int i = n; i <= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
        System.out.print("몇 단 삼각형입니까?: ");
        n = sc.nextInt();
    } while (n <= 0);
    traiangleLB(n);
    sc.close();
  }
}


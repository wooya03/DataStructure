package Quiz;

import java.util.Scanner;

public class Q14 {
  static void triangleLB(int n){
    for (int i = 1; i <= n ; i++){
      for (int j = 1; j <= i; j++)
          System.out.print("*");
      System.out.println();
    }
  }
  static void triangleLU(int n){
    for(int i = 1; i <= n; i++){
      for(int j = n; j >= i; j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void triangleRU(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(" ");
      }
      for(int j = n; j >= i; j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void triangleRB(int n){
    for(int i = 1; i <= n; i++){
      for(int j = n; j >= i; j--){
        System.out.print(" ");
      }
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
    triangleLB(n);
    System.out.println();
    triangleLU(n);
    System.out.println();
    triangleRU(n);
    System.out.println();
    triangleRB(n);
    sc.close();
  }
}


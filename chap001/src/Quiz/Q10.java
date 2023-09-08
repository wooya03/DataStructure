package Quiz;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("자릿수 입력: ");
         String A = sc.nextLine();
         System.out.printf("그 수는 %s자리입니다.", A.length());
         sc.close();
    }
}

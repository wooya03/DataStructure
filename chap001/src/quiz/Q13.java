package quiz;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이: ");
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

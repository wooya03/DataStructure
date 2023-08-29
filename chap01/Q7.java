package chap01;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int result = (1+n)*(n/2);

        if(n%2!=0){ // 만약 정수의 개수가 홀수라면 남은 1개의 홀수를 더하는 선택문
            result += (n+1)/2;
        }

        System.out.println("1에서 " + n  + "까지의 합 : " + result);
        stdIn.close();
    }
}

package chap01;

import java.util.Scanner;

class JudgeABC2x {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요.: ");
        int n = stdIn.nextInt();

        if (n == 1)
        System.out.println("A");
        else if (n == 2)
        System.out.println("B");
        else if (n == 3)
        System.out.println("C");
        else
            ; // ;만 있는 빈 문장은 아무것도 하지 않는다.
        stdIn.close();
    }    
}
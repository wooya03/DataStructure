package chap01;

public class Q3 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if (min > b) min = b;
        if ( min > c) min = c;
        if ( min > d) min = d;
        return min;
    }
    public static void main(String[] args) {
        System.out.println("min4(1,2,3,4) = " + min4(1,2,3,4));
        System.out.println("min4(2,3,5,4) = " + min4(2,3,5,4));
    }
}
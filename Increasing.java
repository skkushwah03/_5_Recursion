package _5_Recursion;

public class Increasing {
    public static void increasing(int n){
        if(n==1){
            return;
        }
        increasing(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n=10;
        increasing(n);
    }
}

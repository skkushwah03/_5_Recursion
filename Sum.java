package _5_Recursion;

public class sum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}

package _5_Recursion;
class Decreasing{
    public static void recursion(int n){
        if(n==0||n==1){
            return;
        }
        System.out.print(n+" ");
        recursion(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        recursion(n);
    }
}

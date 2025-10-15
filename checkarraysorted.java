package _5_Recursion;

public class checkarraysorted {
    public static boolean checksorted(int arr[],int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checksorted(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(checksorted(arr,0));
    }
}

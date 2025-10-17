package _5_Recursion;
public class firstocuurence{
    public static int firstoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        } 
        if(arr[i]==key){
            return i;
        }
        return firstoccur(arr, key, i); 
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4};
        System.out.println(firstoccur(arr,4,0));
    }
}

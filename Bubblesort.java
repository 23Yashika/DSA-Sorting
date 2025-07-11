import java.util.Scanner;

public class Bubblesort{
    public static void main(String[] args) {
       int n;
       System.out.print("enter no. of elements : ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubble(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble(int arr[],int n){
for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
    }
}
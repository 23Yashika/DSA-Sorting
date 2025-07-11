import java.util.Scanner;

public class Selectionsort{
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
        insert(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insert(int arr[],int n){
for(int i=0;i<n-1;i++){
    int min = arr[i];
    int m = i;
    for(int j = i+1;j<n;j++){
        if(min > arr[j]){
            min = arr[j];
            m = j;
        }
    }
    if(m!=i){
        int temp = arr[i];
        arr[i] = arr[m];
        arr[m] = temp;
    }
}
    }
}
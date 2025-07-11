import java.util.Scanner;

public class Insertionsort{
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
int i;
for( i=1;i<n;i++){
    int temp = arr[i];
    int j = i-1;
    while(j>=0 && arr[j]>temp){
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = temp;
}
    }
}
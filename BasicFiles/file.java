import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                System.out.print(arr[j]+" ");
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                System.out.print(arr[j]+" ");
            }
        }
    }
}

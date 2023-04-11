import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        // for(int j=0;j<arr.length;j++){
        //     int temp =arr[j];
        //     arr[j]=arr[j++];
        //     arr[arr.length-1]=temp;

        // }
        int temp =arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=arr[1];
        arr[1]=arr[2];
        arr[2]=arr[3];
        arr[3]=temp;

        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

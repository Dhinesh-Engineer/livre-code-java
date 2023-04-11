import java.util.Scanner;

public class inversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // int arr[]={1,9,6,4,5};
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i<j)&&(arr[i]>arr[j])) {
                    count++;                   
                }
            }
        }
        System.out.println(count);
    }
}

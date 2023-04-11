import java.util.Arrays;
import java.util.Scanner;

public class max_pro {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }


        // max_pro(arr);

        min_max(arr);

        
    }

    private static void max_pro(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int max2=arr[arr.length-2];
        System.out.println(max*max2);
    }

    private static void min_max(int[] arr){
        int sum = 0;
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum-min);
        System.out.println(sum-max);


    }
}

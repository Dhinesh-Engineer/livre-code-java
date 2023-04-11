import java.util.Scanner;

public class chocu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int C =sc.nextInt();
        int arr[]=new int[C];
        for(int i=0;i<C;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int j=0;
        for(int i=1;i<=C;i++){
            sum+=(i*arr[j]);
            j++;
        }
        System.out.println(sum);


    }
}

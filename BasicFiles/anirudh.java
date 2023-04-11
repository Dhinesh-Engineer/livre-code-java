import java.util.Scanner;

public class anirudh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=0;
        for(int i=0;i<n;i++){
            min=Math.min(arr[i],arr[i++]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(min!=arr[i]){
                int temp;
                temp=min-arr[i];
                sum+=temp;
            }
        }
        System.out.println(Math.abs(sum));

    }
}

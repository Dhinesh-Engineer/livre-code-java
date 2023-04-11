import java.util.Scanner;

public class prefectSQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            int sq=(int)Math.sqrt(arr[i]);
            if(sq*sq==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}

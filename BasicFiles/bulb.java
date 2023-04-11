import java.util.Scanner;

public class bulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=1){
                c++;
            }else{
                c--;
            }
        }
       c++;
        System.out.println(arr.length-c);
        System.out.println();

    }
}

import java.util.Scanner;

public class coin_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();




        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            //temp=0;
            temp+=arr[i];
            if(sum!=temp){
                i++;
                System.out.print(temp+" ");
            }
            
        }
        System.out.println(temp);
    }
}

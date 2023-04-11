import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max;
        //int sum=0;
        int arr[]={1,2,5,10,20,50,100,200,500,2000};





        for (int i = arr.length-1; i>=0; i--) {
            if(n>=arr[i]){
                max=arr[i];

                //System.out.print(arr[i]+" ");
                if(n>=max){
                    //sum+=max;
                    
                    n-=max;

                    i++;
                }
                
               
                System.out.print(max+" ");
                //System.out.println(sum);
            }
        }
    }
}

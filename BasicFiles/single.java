import java.util.Scanner;

public class single {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        int arr1[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }





        for(int i=0;i<5;i++){
                if(i==0){
                    System.out.print(((arr[i]*arr1[i])+1)+" "); 
                }
                if(i==1){
                    System.out.print(((arr[i]*arr1[i])-2)+" "); 
                }
                if(i==3){
                    System.out.print(((arr[i]*arr1[i])+4)+" "); 
                }
                if(i==4){
                    System.out.print(((arr[i]*arr1[i])-5)+" "); 
                }
                if(i==2){
            System.out.print(arr[i]*arr1[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(arr1[i]%arr[i]+" ");
        }
        
    }
}

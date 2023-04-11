import java.util.Arrays;
import java.util.Scanner;

public class repeat {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try{
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<10;i=i+1){
            if(arr[i]==arr[i++]){
                count++;

                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println(count);
        
    }catch(Exception E){
        System.out.print("Repeted Element");
    }}
    
}

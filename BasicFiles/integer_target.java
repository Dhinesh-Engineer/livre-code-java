import java.util.Scanner;

public class integer_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={4,5,6,7,0,1,2};
        int t =sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                index=i;
            }
        }
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println(index);
        }

    }
}

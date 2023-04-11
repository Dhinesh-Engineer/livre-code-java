import java.util.Scanner;

public class element {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            break;
        }
        
        for(int j=2;j>0;j--){
            for(int i=2;i>=0;i--){
                if(j==1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==2){
                System.out.print(arr[i][j]+" ");
                }
            }
    }

        
    }
}


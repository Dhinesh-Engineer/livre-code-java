import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int temp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=arr[j][i];
                }
            }
        
        //int res[][]=new int[n][n];
            System.out.println("transpose");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("clockwise");


        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
            System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("anti clockwise"); 

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
            System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println("multiply");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int ans=0;
                for(int k=0;k<n;k++){
                   ans+=arr[i][k]*temp[k][j];
                }
                System.err.print(ans+" ");
            }
            System.out.println();
        }




       
    }
}

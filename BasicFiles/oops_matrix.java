import java.util.Scanner;

public class oops_matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        Inneroops_matrix obj = new Inneroops_matrix();
        obj.mul(arr[][], row,col);
    }
}
/**
 * Inneroops_matrix
 */
class Inneroops_matrix {
    void add(){

    }

    void mul(int arr[][],int r,int c){ 
        if(r1==c)
        {
        for(int i=0;i<r1;i++)
        {
        for(int j=0;j<c1;j++)
        {
            
        }
        }

        for(int i=0;i<r;i++)
        {
            System.out.print("\n");
        for(int j=0;j<c;j++)
        {
            
        System.out.print(" "+crr[i][j]); 
        }
        }
        }
        }
        }


import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        // int arr[][] = {{1,2,3},{1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}};
        // // for(int i=0;i<n;i++){
        // //     for(int j=0;j<n;j++){
        // //         System.out.print(arr[i][j]);
        // //     }
        // // }
        // int arr1[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // for(int i =0;i<n;i++){
        //     if(arr1[i]==1 ){
        //     System.out.println(arr[i][i]);
        //     }
        // }
        // //     if(arr1[0]==1  && arr1[1]==3){
        // //         System.out.println(arr[1][2]);
        // //     }
        // //     if(arr1[0]==2){
        // //         System.out.println(arr[2][3]);
        // //     }
        // //     if(arr1[0]==2  && arr1[1]==3){
        // //         System.out.println(arr[3][4]);
        // //     }
        // //     if(arr1[0]==3){
        // //         System.out.println(arr[4][5]);
        // //     }
        // //     if(arr1[0]==3  && arr1[2]==2){
        // //         System.out.println(arr[0][0]);
        // // }
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
                temp[i]=sc.nextInt();
            }
        int arr[]={1,2,3};
        int arr1[]={1,3,2};
        int arr2[]={2,1,3};
        int arr3[]={2,3,1};
        int arr4[]={3,1,2};
        int arr5[]={3,2,1};
        for(int i=0;i<n;i++){
            if(temp[i]==1){
                for(int j=0;j<n;j++){
                System.out.print(arr1[j]+" ");
                }
            }
            else if(temp[i]==1 && temp[++i]==3){
                for(int j=0;j<n;j++){
                System.out.print(arr2[j]+" ");
                }
            }
            if(temp[i]==2){
                for(int j=0;j<n;j++){
                System.out.print(arr3[j]+" ");
                }
            }
            else if(temp[i]==2 && temp[++i]==3){
                for(int j=0;j<n;j++){
                System.out.print(arr4[j]+" ");
                }
            }
            if(temp[i]==3){
                for(int j=0;j<n;j++){
                System.out.print(arr5[j]+" ");
                }
            }
            else if(temp[i]==3 && temp[++i]==2){
                for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
                }
            }

        }
        
    }
}

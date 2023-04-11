import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //String str=sc.nextLine();
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }
        // System.out.println();


        
        // StringBuilder temp=new StringBuilder();
        // for(int i=str.length()-1;i>=0;i--){
        //     temp.append(str.charAt(i));
        // }

        // String temp="" ;
        // for (int i = str.length()- 1; i >=0; --i) {
        //     temp =  temp+ str.charAt(i);
        // }
        //System.out.println(temp);
        // System.out.println((str.equals(temp))?"Yes ":"No");


        // String str=sc.nextLine();
        // str = str.replaceAll("[aeiouAEIOU]", " ");
        // System.out.println(str);

        // String str=sc.nextLine();
        // StringBuilder temp = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(Character.isUpperCase(c)){
        //         temp.append(c);
        //     }
        // }
        // System.out.println(temp);

        // String str=sc.nextLine();
        // char arr[]=str.toCharArray();
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }


        // String str=sc.nextLine();
        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(Character.isLowerCase(c)){
        //         System.out.print(c);
        //     }
        // }
        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(Character.isUpperCase(c)){
        //         System.out.print(c);
        //     }
        // }

        // String str=sc.nextLine();
        // String sub=sc.nextLine();
        // String replace=sc.nextLine();
        // System.out.println(str.replace(sub, replace));

        // String str=sc.next();
        // String arr[]=str.split("\\s+");
        // for(int i=arr.length-1;i>0;i--){
        //     System.out.print(arr[i]);
        // }

        // int n=sc.nextInt();
        // int []arr[]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // int temp=arr[1][1];
        // // arr[0][0]+=arr[1][1];
        // // arr[0][2]+=arr[1][1];
        // // arr[2][0]+=arr[1][1];
        // // arr[2][2]+=arr[1][1];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==1 &&j==1){
        //             System.out.print(arr[i][j]+" ");
        //         }else if((i+j)%2==0){
        //            // System.out.print(arr[i][j]+" ");
        //             System.out.print((arr[i][j]+temp)+" ");
        //         }
        //         else{
        //             System.out.print("*" +" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // // for(int j=0;j<n;j++){
        // //     for(int i=0;i<n;i++){
        // //        System.out.print(arr[j][i]+" ");
        // //     }
        // //     System.out.println();
        // // }



        // int n=sc.nextInt();
        // int []arr[]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(j==0){
        //             arr[i][j]=arr[i][j+1]+arr[i][j+2];
        //         }
        //         else if(j==1){
        //             arr[i][j]=arr[i][j+1]-arr[i][j];
        //         }
        //     }
        //     System.out.println();
        // // }



        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(j==0){
        //             arr[i][j]*=arr[i][j+2];
        //         }else if(j==2){
        //             arr[i][j]*=arr[i][j-1];
        //         }else if(j==1){
        //             arr[i][j]=42;
        //         }
        //     }
        //     System.out.println();
        // }
        
        // for(int j=0;j<n;j++){
        //     for(int i=0;i<n;i++){
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println();
        // }




       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==1  && j==1){
                    System.out.print(arr[i][j]+" ");
                }
                else if((i+j)%2!=0){
                    int count = (int) Math.log10(arr[i][j]) + 1;
                    System.out.print((count==1)?"S ":"D ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

        









    }
}

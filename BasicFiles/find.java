import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        char str[][]=new char[row][col];
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                char var=sc.next().charAt(j);
            }
        }

        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(str[i][j]=='s' && str[i][++j]=='a'){
                    System.out.println("entered");
                    if(str[i][j+2]=='b' && str[i][j+3]=='a'){
                        System.out.println("eneteredd");
                        count++;
                    }

                }
            }
        }
        System.out.println(count);



    }
}

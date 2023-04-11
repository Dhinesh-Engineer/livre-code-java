import java.util.Scanner;

public class santa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n-->0){
            int mass=sc.nextInt();
            res+=(mass/3)-2;
            System.out.println(res);
        }
        
        System.out.println(res);
    }
}

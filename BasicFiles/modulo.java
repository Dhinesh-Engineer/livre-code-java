import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T =sc.nextInt();
        while(T-->0){
            int N =sc.nextInt();
            int Q = sc.nextInt();
            int sum=0;
            int pro=1;
            if(Q==1){
                for(int i=1;i<=N;i++){
                   sum+=i; 
                }
                System.out.println(sum);
            }else if(Q==2){
                for(int i=1;i<=N;i++){
                pro*=i;}
                System.out.println(pro);
            }
        }
        
    }
}

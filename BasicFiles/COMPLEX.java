import java.util.Scanner;

public class COMPLEX{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        imaginary rc=new imaginary();
        rc.sum(a, b, c, d);
        rc.dif(a, b, c, d);
        rc.mul(a, b, c, d);
        //System.out.println((a+c)+"+"+(b+d)+"i");

    }
}
class imaginary{
    void sum(int a,int b,int c,int d){
        System.out.println((a+c)+"+"+(b+d)+"i");
    }
    void dif(int a,int b,int c,int d){
        System.out.println((a-c)+((b-d)<0?"-":"+")+Math.abs(b-d)+"i");
    }
    void mul(int a,int b,int c,int d){
        int temp=(a*c)-(b*d);
        int temp1=(a*d)+(b*c);
        System.out.println((temp)+"+"+(temp1)+"i");
        

    }
}
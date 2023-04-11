import java.util.Scanner;

public class hackerearth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            //System.out.println(a);
            int length=sc.nextInt();
            String str=sc.next();
            int hcount=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='h'){
                    hcount++;
                    // System.out.println(hcount);
                }
            }
            int acount=0,ccount=0,kcount=0;
            int con=0,rcount=0,tcount=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='a'){
                    acount++;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='c'){
                    ccount++;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='k'){
                    kcount++;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='e'){
                    con++;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='r'){
                    rcount++;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='t'){
                    tcount++;
                }
            }
            int sum=hcount+acount+ccount+kcount+con+rcount+tcount;
            //System.out.println(sum);
            if(sum%11==0){
                System.out.println(sum/11);
            }else{
                System.out.println(0);
            }

        
    }
}

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int count=0;
            String str=sc.nextLine();
            int length=str.length();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='B'){
                    count++;
                }
            }
            int exp=count*4;
            if(exp>length){
                System.out.println(length-count);
            }
            else{
                System.out.println(length);
                //System.out.println();
            }
        
    }
}

import java.util.Scanner;

public class reverse_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();

        if(str.length()==str1.length()){
            if((str+str).contains(str1)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }
                
          

        
    }
}

import java.util.Scanner;

public class meta_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // StringBuilder str1 =new StringBuilder("geeks");
        // StringBuilder str2= new StringBuilder("keegs");

        StringBuilder str1 =new StringBuilder("");
        str1.append(sc.nextLine());
        StringBuilder str2= new StringBuilder("");
        str2.append(sc.nextLine());


        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                count++;
            }
        }
        System.out.println((count==2)?"YES":"NO");
        

    }







    
}

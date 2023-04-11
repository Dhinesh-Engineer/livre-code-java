import java.util.Scanner;

public class check_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char:");
        char A = sc.next().charAt(0);
        int B = A;
        if((65<=B)&&(B<=90)||(97<=B)&&(B<=122)){
            System.out.println("Give Char is Alphabet");
            char vow[] ={'A','E','I','O','U','a','e','i','o','u'};
            for(int i=0;i<vow.length;i++){
            if(A==vow[i]){
                System.out.println("Given char is Vowel");
            }else{
                System.out.println("not vowel");
            }
        }
        
        }
        else{
            System.out.println("not a Char");
        }

        // char vow[] ={'A','E','I','O','U','a','e','i','o','u'};
        // for(int i=0;i<vow.length;i++){
        //     if(A==vow[i]){
        //         System.out.println("Given char is Vowel");
        //     }
        // }
        // System.out.println("Given char is Consonant");



    }
}

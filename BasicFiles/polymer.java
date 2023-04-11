import java.util.Scanner;

public class polymer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder str=new StringBuilder("dabAcCaCBAcCcaDA");
       // System.out.println(str);
        StringBuilder res=new StringBuilder();
        StringBuilder fin=new StringBuilder();
       for(int i=0;i<str.length();i++){
         res=cal(str);
         fin=cal(res);
       }
       System.out.println(res);
        //System.out.println(res.length());
       //System.out.println(fin);
       System.out.print(fin.length()-2);
       
       
    }

    private static StringBuilder cal(StringBuilder res) {
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<res.length();i++){
            //System.out.println(str.charAt(i));
                //temp.append(i);
                int a=res.charAt(i);
               // System.out.println(a);
                int b=res.charAt(++i);
               // System.out.println(b);
                if(Math.abs(a-b)!=32){
                    temp.append((char)a);
                    temp.append((char)b);
                    // System.out.println(temp);
                }
        }
        // System.out.println(temp);
        // System.out.println(temp.length());
        return temp;
    }
     
}

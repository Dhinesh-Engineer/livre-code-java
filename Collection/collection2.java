import java.util.HashMap;
import java.util.Scanner;

public class collection2 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        HashMap<Integer,String> obj =new HashMap<Integer,String>();
        int ch = sc.nextInt();
        while (ch != 0) {

            switch (ch) {
                case 1: {
                    System.out.println("ADD ");
                    int a =sc.nextInt();
                    String b=sc.next();
                    obj.put(a, b);
                    break;
                }
                case 2:{
                    System.out.println("Display");
                    System.out.println(obj);
                }
                //obj.get("int");
                //obj.remove("int");
                //obj.clear();
                //obj.size();
                // for (String i : obj.keySet()) {
                //     System.out.println(i);
                //   }
                        // keySet() for keys and values() for values.
            }
            ch=sc.nextInt();
        }


    }
}

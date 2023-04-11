import java.util.Scanner;

public class inheritance {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        Innerinheritance obj =new Innerinheritance();
        Innerinheritance_2 res=new Innerinheritance_2();
        obj.perimeter(b, l);
        obj.area(l,b);
        res.demo();

    }
}
/**
 * Innerinheritance
 */
class Innerinheritance extends Innerinheritance_1{

    public void perimeter(int b, int l) {
        System.out.println("perimeter "+(2*l+2*b));
    }

    
}
/**
 * Innerinheritance_1
 */
class Innerinheritance_1  {

    public void area(int b, int l) {
        System.out.println("area "+l*b);
    }
    
}

/**
 * Innerinheritance_2
 */
class Innerinheritance_2 extends Innerinheritance{

    void demo(){
        System.out.println("working");
    }
    
    
}

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int custno=sc.nextInt();
        String cust_name=sc.next();
        int p_m_reading=sc.nextInt();
        int c_m_reading=sc.nextInt();
        char type=sc.next().charAt(0);

        details obj =new details();
        obj.billing(custno,cust_name,p_m_reading,c_m_reading,type);
        
    }
    
}
class details{
    int custno;
    String cust_name;
    int p_m_reading;
    int c_m_reading;
    char type;
    public void billing(int custno2, String cust_name2, int p_m_reading2, int c_m_reading2, char type2) {
        System.out.println("customer No "+custno2);
        System.out.println("customer name "+cust_name2);
        System.out.println("Prevoius month reading "+p_m_reading2);
        System.out.println("Current Month reading "+c_m_reading2);
        System.out.println("Type "+type2);
        System.out.println();
        int amt=0;
        if(c_m_reading2<=100){
            amt+=c_m_reading2*1;
        }
        else if(c_m_reading2<=200){
            amt+=100+((c_m_reading2-100)*2.5);
        }
        else if(c_m_reading2<=500){
            amt+=100+((c_m_reading2-200)*4);
        }
        else if(c_m_reading2>=501){
            amt+=100+((c_m_reading2-300)*6);
        }
        System.out.println("bill Amount"+amt);
    }
}

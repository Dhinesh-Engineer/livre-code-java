import java.util.Scanner;

public class oops_con {
    //constructor
    String dest;
    public oops_con(String d) {
        dest=d;
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        //employee class obj
        employee em=new employee();
       
        //users inputs
        int emp_Id=sc.nextInt();
        String emp_name=sc.next();
        int Salary=sc.nextInt();

        //employee function call
        em.details(emp_Id, emp_name);
        
        //inhertance obj
        Salary s=new Salary();
        s.Salary(Salary);
        
        //constructor 
        oops_con op=new oops_con("staff");
        System.out.println("work :"+op.dest);

    }
}
/**
 * employee
 */
class employee {
    void details(int emo_Id,String emo_name){
        System.out.println("Id :"+emo_Id);
        System.out.println("Name "+emo_name);
    }
    
}

class Salary extends employee{
    void Salary(int Salary){
        System.out.println("Salary :"+Salary);
    }
}

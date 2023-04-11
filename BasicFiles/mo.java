public class mo {
    public static void main(String[] args) {
     rect r=new rect();
     r.area(7,33);   
     r.area(9876543100,3);
    /*  r.area(6.7,8.9);






     r.area(7.3,33);
     r.area(8.7654321899,987654322);*/
    }
}







class rect{
    void area(int l,int b){
        System.out.print("Love ");
    }
    void area(long x,int y){
        System.out.print("Me ");
    }
    void area(float l,float b){
        System.out.println("Like ");
    }
    void area(float l,int b){
        System.out.println("You ");
    }
    void area(double l,long b){
        System.out.println("Do ");
    }
}

public class boxclass {
    public static void main(String[] args) {
        box sc=new box();
        double vol;
        sc.width=10;
        sc.height=20; 
        sc.depth=15;
        vol=sc.depth*sc.width*sc.height;
        System.out.println(vol);
    }
}
class box{
    double width;
    double height;
    double depth;
}

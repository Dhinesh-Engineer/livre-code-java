abstract class shape{
    abstract void area();
}

class Rectangle extends shape {
    void area(){
        int l=6;
        int b=7;
        System.out.println("Area of rectangle:"+l*b);
    }    
}

class Triangle extends shape{

    void area(){
        int b=4;
        int h=3;
        System.out.println("Area of Triangle:"+(0.5*b*h));
    }
}

class Circle extends shape{

    void area(){
        int r=4;
        System.out.println("Area of circle"+(3.14*r*r));
    }
}

class w {

    public static void main(String[] args) {

        Triangle obj2 =new Triangle();
        Rectangle obj = new Rectangle();
        Circle obj3 = new Circle();
        obj2.area();
        obj.area();
        obj3.area();

        
    }
   
}
    
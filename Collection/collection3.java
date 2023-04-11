import java.util.Iterator;
import java.util.TreeSet;

public class collection3 {
    public static void main(String[] args) {
        TreeSet<Integer> obj= new TreeSet<Integer>();
        obj.add(3);//add specfic element to set if it is not already present.

        obj.add(2);
        obj.add(4);
        obj.add(1);
        obj.add(7);
        obj.add(8);
        obj.add(9);


        Iterator i=obj.iterator();  
         while(i.hasNext())  
         {  
             System.out.print(i.next()+" ");  
         }  

        // obj.pollFirst();
        // obj.pollLast();
        // obj.remove(0);
        // obj.clear();
        //System.out.println( obj.clone()+" "+obj.first()+" "+obj.last()+" "+obj.size());
        // System.out.println(obj.tailSet(2,false));
        // System.out.println(obj.headSet(2,true));
        System.out.println(obj.subSet(8,true,9,true));
        // obj.clone();
        // obj.first();
        // obj.last();
        // obj.size();
    }
}

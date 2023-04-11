import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class collection1 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.println("1.add\n2.access using index\n3.size of array\n4.sort \n5.delete using index\n6.delete all elements\n7.Add element at first\n8.add element at last\n9.remove element at first\n10.remove element at last.");
        int ch = sc.nextInt();
        while (ch != 0) {
            
            switch (ch) {
                case 1: {
                    System.out.println("Enter the element: ");
                    int a = sc.nextInt();
                    num.add(a);
                    break;
                }
                case 2: {
                    System.out.println("Enter the index position to access");
                    int b = sc.nextInt();
                    System.out.println(num.get(b));
                    break;
                }
                case 3: {
                    System.err.println("Size of the Linked List");
                    System.out.println(num.size());
                    break;
                }
                case 4: {
                    System.out.println("Sorted Array");
                    Collections.sort(num);
                    for (int i : num) {
                        System.out.println(i);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Remove element using index");
                    int c = sc.nextInt();
                    System.out.println(num.remove(c));
                    break;
                }
                case 6: {
                    System.out.println("Delete all elements");
                    num.clear();
                    System.out.println(num);
                    break;
                }
                case 7: {
                    System.out.println("Add element at first");
                    int j=sc.nextInt();
                    num.addFirst(j);
                    break;
                }
                case 8: {
                    System.out.println("Add element at Last");
                    int j=sc.nextInt();
                    num.addLast(j);
                    break;
                }
                case 9: {
                    System.out.println("remove element at Last");
                    num.removeFirst();
                    break;
                }
                case 10: {
                    System.out.println("remove element at Last");
                    num.removeLast();
                    break;
                }
                case 11:{
                    System.out.println("Display");
                    for (int i : num) {
                        System.out.println(i);
                    }
                    break;
                }
            }
            ch = sc.nextInt();
        }

    }
}

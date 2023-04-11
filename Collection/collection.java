import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.println(
                "1.add\n2.access using index\n3.size of array\n4.sort \n5.delete using index\n6.delete all elements");
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
                    System.err.println("Size of the array");
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
                }

            }
            ch = sc.nextInt();
        }

    }
}

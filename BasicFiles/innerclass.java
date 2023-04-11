// import java.util.Scanner;

// public class innerclass {
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         System.out.println(5);
//         innerclass obj = new innerclass();
//         obj.main(args);
        
            
//     }
// }


import java.util.Scanner;

public class innerclass {
    private static int MAX_ITERATIONS = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(5);
        int iterations = 0;
        while (iterations < MAX_ITERATIONS) {
            innerclass obj = new innerclass();
            obj.main(args);
            iterations++;
        }
    }
}

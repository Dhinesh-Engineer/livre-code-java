import java.util.Scanner;

public class Word_string {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();













        String arr[]=str.split("\\s+");
        String min = arr[0];
	    String max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i].length() < min.length()) {
	                min = arr[i];
	            }
	            if (arr[i].length() > max.length()) {
	                max= arr[i];
	            }
	        }
	        System.out.println(min);
	        System.out.println(max);
       

    }
}

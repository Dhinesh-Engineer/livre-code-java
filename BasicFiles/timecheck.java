import java.io.*;
import java.util.Scanner;

public class timecheck {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
		int hh = obj.nextInt();
		int mm = obj.nextInt();
		int ss = obj.nextInt();
		if(hh>=0 && hh<24)
		{
			if(mm>=0 && mm<=59)
			{
				if(ss>=0 && ss<=59)
				{
					System.out.println("Valid");
				}
				else
					System.out.println("Not Valid");
			}
			else
				System.out.println("Not Valid");
				
		}
		else
			System.out.println("Not Valid");	
    }
}

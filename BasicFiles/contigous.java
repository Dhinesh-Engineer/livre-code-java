import java.io.*;
import java.util.*;
class contigous{
	public static void main(String args[]){
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements of the array :");
		int n=sc.nextInt();
		System.out.println("Size of Subarray :");
		int k=sc.nextInt();
		int a[]=new int[n];
		System.out.println("The array elements are : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=n-k;i++)
		{
			max=a[i];
			//System.out.println(i+" ");
			for (int j=1;j<k;j++) 
			{	
				//System.out.print(j+" ");
				if (a[i+j]>max)
				{
					max=a[i+j];
				}
			
			}
			System.out.print(max + " ");
		}
	}
}
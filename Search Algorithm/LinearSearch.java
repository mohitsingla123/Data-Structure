import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the size of Array\n");
	    int n = scanner.nextInt();
	    int[] arr = new int[n];
		System.out.println("\nEnter Values in array");
		
		for(int i=0;i<n;i++)
		{
		   arr[i] = scanner.nextInt();
		}
	    System.out.println("Enter the Value you want to Search");
	    int value = scanner.nextInt();
	    for(int j=0;j<n;j++)
	    {
	        if(arr[j]==value)
	        {
	            System.out.println("Your Value is in "+ (j+1) +"Position");
	            break;
	        }
	    }
	}
}

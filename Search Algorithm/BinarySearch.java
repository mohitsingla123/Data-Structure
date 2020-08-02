import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{   
    public static void bsearch(int arr[], int start, int end, int num)
    {
        int mid = start + (end-1)/2;
        if(start>end)
         {
        System.out.println("Number Not Found");
         }
        else if(arr[mid]==num)
        {
            System.out.println("Your number found at possition : "+(mid+1));
        }
        else if(arr[mid]>num)
        {
            end = mid-1;
            bsearch(arr,start,end,num);
        }
        else if(arr[mid]<num)
        {
            start = mid+1;
            bsearch(arr,start,end,num);
        }
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter an array of " + n +" numbers in sorted form to using binary search :");
         //Binary search works only on sorted arrays
        for(int i=0; i<n; i++){
        arr[i] = scanner.nextInt();
    }

        System.out.println("Enter the number you wants to search \n");
        int num = scanner.nextInt();
        bsearch(arr, 0, n-1, num);   

	}
}

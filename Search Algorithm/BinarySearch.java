import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{   
    public static void bsearch(int arr[], int start, int end, int num)
    {
        int mid = (end-start)/2;
        if(arr[mid]==num)
        {
            System.out.println("Your number found at possition : "+(mid+1));
        }
        else if(arr[mid]>num)
        {
            end = mid-1;
            return bsearch(arr,start,end,num);
        }
        else if(arr[mid]<num)
        {
            start = mid+1;
            bsearch(arr,start,end,num);
        }
        if(start>end)
        System.out.println("Number Not Found");
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter an array of" + n +" numbers in sort form to using binary search :");
    //user input for array values
        for(int i=0; i<n; i++){
        arr[i] = scanner.nextInt();
    }
        int end=arr.length-1;  

    
       // int arr[10] = {1,2,3,4,5,6,7,8,9,10};
        //for binary search algo, array need to be sorted to work properly
        System.out.println("Enter the number you wants to search \n");
        int num = scanner.nextInt();
        bsearch(arr, 0, end, num);   

	}
}

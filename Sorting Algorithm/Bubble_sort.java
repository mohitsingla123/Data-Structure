import java.io.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int swap =0;
        for(int j = 0; j<n-1;j++)
        {
            for(int i = 0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swap++;
                }
            }
        }   

        System.out.println("Array is sorted in " + swap +" swaps. \nFirst Element: "+ a[0] +"\nLast Element: "+ a[n-1]);
    }
}

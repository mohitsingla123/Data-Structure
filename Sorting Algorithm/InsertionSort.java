// Sorting array arr using insertion sort

public class InsertionSort{

     public static void main(String []args){
       int arr[] = {2,6,4,7,34,87,3};

        int len = arr.length;
        for(int i =1;i<len;i++)
        {
            int k = i-1;
            int element = arr[i];
            while(k>=0 && element<arr[k])
            {
                    arr[k+1] = arr[k];
                    arr[k] = element;
                    k--;
            }
        }
        for(int p =0; p<len;p++)
        {
            System.out.print(arr[p]+" ");
        }
     }
}

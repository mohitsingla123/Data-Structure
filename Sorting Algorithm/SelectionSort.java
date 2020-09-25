//Sorting using Selection Sort

public class SelectionSort{

     public static void main(String []args){
         
     int arr[] = {3,6,1,4,7,4,9};
     int len = arr.length;
     for (int i = 0;i<len-1;i++)
     {
         for(int j = i+1;j<len;j++)
         {
             if(arr[j] < arr[i] )
             {
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
     }
     
     for(int a = 0;a<len;a++)
     {
        System.out.print(arr[a] + " ");
     }
         }
}

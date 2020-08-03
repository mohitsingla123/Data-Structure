import java.lang.Math; 

public class Main
{
    public static void jumpsort(int arr[], int search, int p )
    {
    int k = p-1;
    if(k<0 || k>9)
    {
        System.out.println("Value not find in array");
    }
    else if(arr[k]==search)
    {
        System.out.println("Searching element find at possition "+(k+1));
    }
    else if (arr[k]>search)
    {
        jumpsort(arr, search ,p+3);
    }
    else if(arr[k]<search)
    {
        for(int i=k-p;i<k;i++)
        {
        if(arr[i]==search)
        {
        System.out.println("Searching element find at possition"+(i+1));
        }
        }
    }
    }
    
	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int search = 2;
	//need array in sorted  form for jump algo to work
	int p = (int)Math.sqrt(10);
	jumpsort(arr, search,p);
	
	}
}

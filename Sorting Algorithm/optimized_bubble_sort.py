# Bubble Sorting Algorithm

def Optimized_BubbleSort(A,n):
    for k in range(1,n):
        flag=0
        for i in range(0,n-k):
            if(A[i]>A[i+1]):
                A[i],A[i+1]=A[i+1],A[i]
                flag=1
        if(flag==0):
            break

if __name__=="__main__":
    print("Enter elements in the array: ")
    A=list(map(int,input().split(" ")))
    n=len(A)
    Optimized_BubbleSort(A,n)
    for i in range(0,n):
        print(A[i],end=" ")

'''
Time Complexity:
  1. Best Case: O(n)
  2. Average Case: O(n^2)
  3. Worst Case: O(n^2)

Space Complexity: O(1)
'''

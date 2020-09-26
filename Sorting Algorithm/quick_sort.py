# Quick Sorting Algorithm

def QuickSort(A,start,end):
    if(start<end):
        pindex=Partition(A,start,end)
        QuickSort(A,start,pindex-1)
        QuickSort(A,pindex+1,end)

def Partition(A,start,end):
    pivot=A[end]
    pIndex=start
    for i in range(start,end):
        if(A[i]<=pivot):
            A[i],A[pIndex]=A[pIndex],A[i]
            pIndex+=1
    A[pIndex],A[end]=A[end],A[pIndex]
    return pIndex

if __name__=="__main__":
    A=[]
    print("Enter the elements in the Array: ")
    A=list(map(int,input().split(" ")))
    end=len(A)-1
    print("Sorted Array: ",end="")
    QuickSort(A,0,end)
    for i in range(0,len(A)):
        print(A[i],end=" ")

'''
Time Complexity:
    1. Best Case: O(nlogn)
    2. Average Case: O(nlogn)
    3. Worst Case: O(n^2)

Space Complexity:
    1. Average Case: O(logn)
    2. Worst Case: O(n)
'''

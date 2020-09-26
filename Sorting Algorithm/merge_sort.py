# Merge Sorting Algorithm

def MergeSort(A):
    n=len(A)
    if(n<2):
        return A
    else:
        mid=n//2
        L=[0]*mid
        R=[0]*(n-mid)
        for i in range(0,mid):
            L[i] = A[i]
        for j in range(mid,n):
            R[j-mid] = A[j]
        MergeSort(L)
        MergeSort(R)
        Merge(L,R,A)

def Merge(L,R,A):
    nL=len(L)
    nR=len(R)
    i=0
    j=0
    k=0
    while(i<nL and j<nR):
        if(L[i]<=R[j]):
            A[k]=L[i]
            i=i+1
        else:
            A[k]=R[j]
            j=j+1
        k=k+1
    while(i<nL):
        A[k]=L[i]
        i=i+1
        k=k+1
    while(j<nR):
        A[k]=R[j]
        j=j+1
        k=k+1
if __name__=="__main__":
    A=[]
    print("Enter the elements in the array: ")
    A=list(map(int,input().split(" ")))
    print("Sorted Array: ",end="")
    MergeSort(A)
    for i in range(0,len(A)):
        print(A[i],end=" ")

# Time Complexity: Î(nlogn)

# Space Complexity: Î(n)


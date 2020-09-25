# Insertion Sort Algorithm:

def InsertionSort(A,n):
    for i in range(1,n):
        value=A[i]
        hole=i
        while(hole>0 and A[hole-1]>value):
            A[hole]=A[hole-1]
            hole=hole-1
        A[hole]=value

if __name__=="__main__":
    print("Enter the elements in the array")
    A=list(map(int,input().split(" ")))
    n=len(A)
    InsertionSort(A,n)
    print("Sorted Array: ",end="")
    for i in range(0,n):
        print(A[i],end=" ")

'''
Time Complexity:
    1. Best Case: O(n)
    2. Average Case: O(n^2)
    3. Worst Case: O(n^2)

Space Complexity: O(1)
'''

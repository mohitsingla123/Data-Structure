def binary(arr, item, l, u):
    if(u>=l):
        mid = u+l//2
        if(arr[mid]==item):
            return(mid+1)
        elif(item<arr[mid]):
            return binary(arr, item, l, mid-1)
        else:
            return binary(arr, item, mid+1, u)
    else:
        return("-1")
    
arr = [1,2,4,5,6,7,8]
it = 8
print("Found at ", binary(arr, it, 0, len(arr)-1))

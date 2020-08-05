import math
def jump(arr, item):
    l = len(arr)
    jp = math.sqrt(l)
    a = 0
    while(arr[int(min(jp,l)-1)]<item):
        a = jp
        jp=jp+math.sqrt(l)
        if(a>=l):
            return -1
    while(arr[int(a)]<item):
        a=a+1
        if(a==min(jp,l)):
            return -1
    if arr[int(a)]==item:
        return a
    return -1

#the array should be sorted
arr = [11,22,33,44,52,67,72,89]
item = 89
index =jump(arr, item)
print("%.0f"%index)

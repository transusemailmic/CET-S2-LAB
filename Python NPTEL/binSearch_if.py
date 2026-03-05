def bubble(arr):
    n=len(arr)
    for i in range(n):
        for j in range(n-i-1):
            if(arr[j]>arr[j+1]):
                temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
    return arr
def binSearch(arr,item):
    low=0
    high=len(arr)-1
    count=0
    while(low<=high):
        count+=1
        mid=(low+high)//2
        if(arr[mid]==item):
            return "item found at position "+str(mid)+"\tIterations Needed: "+str(count)
        elif(item>arr[mid]):
            low=(mid)+1
        elif(item<arr[mid]):
            high=(mid)-1
    return "Item not found"
        
arr=[1,5,3,6,3,7,8]
arr=bubble(arr)
print(binSearch(arr,6))
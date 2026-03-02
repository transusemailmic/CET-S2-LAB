def bubble(arr):
    n=len(arr)
    for i in range(n):
        for j in range(n-i-1):
            if(arr[j]>arr[j+1]):
                temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
    return arr
def binSearch(arr,item,low,high):
    if low>high:
        return "Item Not Found"
    mid=(low+high)//2
    if(arr[mid]==item):
        return str(mid)
    elif(item>arr[mid]):
        low=(mid)+1
        return binSearch(arr,item,low,high)
    elif(item<arr[mid]):
        high=(mid)-1
        return binSearch(arr,item,low,high)
        
        
arr=[1,5,3,6,3,7,8]
arr=bubble(arr)
print(binSearch(arr,5,0,len(arr)-1))
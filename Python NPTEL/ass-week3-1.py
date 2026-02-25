str=input()
arr=list(item.strip() for item in str.split(","))
length=len(arr[0])
index=0
for i in range(len(arr)):
    if(len(arr[i])<=length):
        index=i
print(arr[index],end='')
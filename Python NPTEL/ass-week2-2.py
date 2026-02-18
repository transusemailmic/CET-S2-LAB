str=input()
numArr=list(map(int,str.split()))
n=len(numArr)
result=[]
for i in range(n):
    if(numArr[i]>50):
        result.append(numArr[i])
n=len(result)
if n==0:
    print(0,end="")
else:
    for i in range(n):
        if i==n-1:
            print(result[i],end="")
        else:
            print(result[i],end=" ")

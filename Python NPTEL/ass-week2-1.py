flag=1
while(flag==1):
    is_neg=0
    not_least1=0
    str=input()
    numArr=[int(item.strip()) for item in str.split()]
    n=len(numArr)
    for i in range(n):
        if(numArr[i]<0):
            is_neg=1
            break
    if n==0:
        not_least1=1
    if(is_neg==1 or not_least1==1):
        continue
    else:
        flag=0
    sum=sum(numArr)
    avg=sum/n
    count=0
    for i in range(n):
        if(numArr[i]>avg):
            count=count+1
    print(count,end="")

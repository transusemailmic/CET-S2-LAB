flag=1
while(flag==1):
    str=input()
    numArr=list(map(int,str.split()))
    n=len(numArr)
    if(n==0):
        continue
    else:
        flag=0
    str_inc=1
    for i in range(1,n):
        if(numArr[i]<=numArr[i-1]):
            str_inc=0
            break
    if(str_inc==1):
        print(True,end="")
    else:
        print(False,end="")
            
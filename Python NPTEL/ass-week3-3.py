import math
s=input()
arr=[st.strip() for st in s.split(",")]
sum=0
for i in range(len(arr)):
    sum+=len(arr[i])
avg=math.ceil(sum/len(arr))
count=0
for i in range(len(arr)):
    if(len(arr[i])>avg):
        count+=1
print(count,end="")
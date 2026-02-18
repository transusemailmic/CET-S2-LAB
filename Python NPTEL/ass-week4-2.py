def is_perfect(n):
    if(n>0 and n<10**6):
        sum=0
        for i in range(1,(n//2)+1):
            if(n%i==0):
                sum+=i
        return True if sum==n else False
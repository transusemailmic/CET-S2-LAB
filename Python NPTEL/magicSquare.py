def squareCreate(n):
    magicSquare=[[0 for i in range(n)] for j in range(n)]
    
    i=n//2
    j=n-1
    count=1
    while(count<=n*n):
        if(i==-1 and j==n):
            i=0
            j=n-2
        elif(i==-1):
            i=n-1
        elif(j==n):
            j=0
        if magicSquare[i][j]!=0:
            i=i+1
            j=j-2
            continue
        else:
            magicSquare[i][j]=count
            count+=1
        i=i-1
        j=j+1
    print("Magic Square is: ")
    for row in magicSquare:
        for col in row:
            print("%02d" %col,end=" ")
        print()
    print("Sum of row/column/diagonal is: ",str(n*(n**2+1)/2))

squareCreate(3)
for n in range(1,100):
    if(n%5==0 and n%3==0):
        print(str(n)+"= "+"FizzBuzz")
    elif(n%3==0):
        print(str(n)+"= "+"Fizz")
    elif(n%5==0):
        print(str(n)+"= "+"Buzz")
    else:
        print(str(n)+"= ")
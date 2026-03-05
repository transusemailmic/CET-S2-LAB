def divisors(n):
    divisor_array=[]
    for i in range(1,(n//2)+1):
        if(n%i==0):
            divisor_array.append(i)
    divisor_array.append(n)
    divisor_array=list(set(divisor_array))
    divisor_array.sort()
    return divisor_array

def common_divisors(a,b):
    a_div=divisors(a)
    b_div=divisors(b)
    com_div_arr=[]
    for itema in a_div:
        for itemb in b_div:
            if itema==itemb:
                com_div_arr.append(itema)
    return com_div_arr

def divisors_upto(n):
    div_dict={}
    for i in range(1,n+1):
        div_arr=divisors(i)
        div_dict[i]=div_arr
    return div_dict
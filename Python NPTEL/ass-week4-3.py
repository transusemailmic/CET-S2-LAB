def has_duplicates(L):
    stack=set()
    duplicate=set()
    for i in range(len(L)):
        if L[i] in stack:
            duplicate.add(L[i])
        else:
            stack.add(L[i])
    return False if(len(duplicate)==0) else True
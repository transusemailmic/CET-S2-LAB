def safe_first(L):
    if len(L)==0:
        return None
    else:
        return L[0]
def safe_last(L):
    if len(L)==0:
        return None
    else:
        return L[-1]
def safe_middle(L):
    if len(L)==0:
        return None
    elif(len(L)==1 or len(L)==2):
        return []
    else:
        return L[1:-1]

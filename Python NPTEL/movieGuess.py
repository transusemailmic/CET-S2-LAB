import random
movies=['kgf', 'baahubali', 'pushpa', 'brahmastra', 'drishyam', 'dangal', 'lokah', 'pulimurugan', 'marco', 'aavesham']
def create_question(picked_movie):
    n=len(picked_movie)
    letters=list(picked_movie)
    temp=[]
    for i in range(n):
        if letters[i]==' ':
            temp.append(' ')
        else:
            temp.append('*')
    qn=''.join(str(x) for x in temp)
    return qn
def is_present(letter,picked_movie):
    c=picked_movie.count(letter)
    if c==0:
        return False
    else:
        return True
def unlock(qn, movie, letter):
    ref = list(movie)      
    qn_list = list(qn)     
    temp = []
    n = len(movie)
    for i in range(n):
        if ref[i] == ' ' or ref[i] == letter:      
            temp.append(ref[i])                      
        else:
            if qn_list[i] == '*':                   
                temp.append('*')
            else:
                temp.append(ref[i])
    qn_new = ''.join(str(x) for x in temp)
    return qn_new

    
def play():
    p1name=input("Player 1, Please enter your name: ")
    p2name=input("Player 2, Please enter your name: ")
    pp1=0
    pp2=0
    turn=0
    willing=True
    while willing:
        if turn%2==0:
            print(p1name,"Your turn")
            picked_movie=random.choice(movies)
            qn=create_question(picked_movie)
            print(qn)
            modified_qn=qn
            not_said=True
            while not_said:
                letter=input("Your letter: ")
                if is_present(letter,picked_movie):
                   modified_qn=unlock(modified_qn,picked_movie,letter)
                   print(modified_qn)
                   d=int(input("Press 1 to guess the movie or 2 to unlock another letter: "))
                   if(d==1):
                       ans=input("Your answer: ")
                       if ans==picked_movie:
                           pp1+=1
                           print("Correct")
                           not_said=False
                           print(p1name,"Your Score:",pp1)
                       else:
                           print("Wrong Answer, Try Again")
                    
                else:
                    print(letter, "Not found")
            c=int(input("Press 1 to continue or 0 to quit"))
            if(c==0):
                print(p1name,",Your Score: ",pp1)
                print(p2name,",Your Score: ",pp2)
                print("Thankyou, have a nice day")
                willing=False
        else:
            print(p2name,"Your turn")
            picked_movie=random.choice(movies)
            qn=create_question(picked_movie)
            print(qn)
            modified_qn=qn
            not_said=True
            while not_said:
                letter=input("Your letter: ")
                if is_present(letter,picked_movie):
                   modified_qn=unlock(modified_qn,picked_movie,letter)
                   print(modified_qn)
                   d=int(input("Press 1 to guess the movie or 2 to unlock another letter: "))
                   if(d==1):
                       ans=input("Your answer: ")
                       if ans==picked_movie:
                           pp2+=1
                           print("Correct")
                           not_said=False
                           print(p2name,"Your Score:",pp2)
                       else:
                           print("Wrong Answer, Try Again")
                    
                else:
                    print(letter, "Not found")
            c=int(input("Press 1 to continue or 0 to quit"))
            if(c==0):
                print(p1name,",Your Score: ",pp1)
                print(p2name,",Your Score: ",pp2)
                print("Thankyou, have a nice day")
                willing=False
        turn=turn+1
play()
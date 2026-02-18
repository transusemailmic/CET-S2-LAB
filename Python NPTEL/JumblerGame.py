import random
def choose():
    words=["apple","rainbow","cake","flavour","computer","science","miracle","program"]
    picked_word=random.choice(words)
    return picked_word
def jumble(picked_word):
    jum_list=random.sample(picked_word,len(picked_word))
    qn="".join(jum_list)
    return qn
def play():
    p1name=input("Enter player 1 Name: ")
    p2name=input("Enter player 2 Name: ")
    p1score=0
    p2score=0
    turn=0
    while(1):
        picked_word=choose()
        qn=jumble(picked_word)
        print(qn)
        if turn%2==0:
            print(p1name,", your turn")
            ans=input("Your Guess: ")
            if ans==picked_word:
                p1score+=1
                print("Your score is ",p1score)
            else:
                print("Wrong, Correct answer: ",picked_word)
            c=int(input("Enter 1 to continue and 0 to exit"))
            if c==0:
                print("Thankyou,",p1name,":",p1score,p2name,":",p2score)
                break
            turn+=1
        else:
            print(p2name,", your turn")
            ans=input("Your Guess: ")
            if ans==qn:
                p2score+=1
                print("Your score is ",p2score)
            else:
                print("Wrong, Correct answer: ",picked_word)
            c=int(input("Enter 1 to continue and 0 to exit"))
            if c==0:
                print("Thankyou,",p1name,":",p1score,p2name,":",p2score)
                break
            turn+=1
            
play()
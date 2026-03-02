import random
doors=[0]*3
goatdoor=[]
swap=0
dont_swap=0
for i in range(10):
    x=random.randint(0,2)
    doors[x]="BMW"
    for i in range(0,3):
        if(i==x):
            continue
        else:
            doors[i]="Goat"
            goatdoor.append(i)
    choice=random.randint(0,2)
    door_open=random.choice(goatdoor)
    while door_open==choice:
        door_open=random.choice(goatdoor)
    ch_arr=['y','n']
    ch=random.choice(ch_arr)
    if ch=='y':
        if doors[choice]=='Goat':
            print("Player Wins")
            swap+=1
        else:
            print("Player Lost")
    else:
        if doors[choice]=='Goat':
            print("Player Lost")
        else:
            print("Player Wins")
            dont_swap+=1
print("Swap:",swap)
print("Dont Swap:",dont_swap)
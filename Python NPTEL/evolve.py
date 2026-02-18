import random
def evolve(filename):
	cont=''
	with open(filename,"r") as file:
		cont=list(file.readline())
	cont_l=len(cont)
	for i in range(100000):
		index=random.randint(0,cont_l-1)
		p=random.randint(1,100)
		if(p==1):
			if(cont[index]=='0'):
				cont[index]='1'
			else:
				cont[index]='0'
	cont="".join(cont)
	with open(filename,"w") as file:
		file.write(cont)

filename='data.txt'
evolve(filename)

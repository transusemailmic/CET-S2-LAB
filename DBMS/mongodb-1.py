import pymongo
client=pymongo.MongoClient('mongodb://localhost:27017/')
db=client['college']
col=db['studlist']

# 1. Display fname and lname of all female students in MCA

for item in col.find({'gender':'female','course':'MCA'},{'_id':0,'name':{'fname':1,'lname':1}}):
    print("First Name:",item['name']['fname'],"Last Name:",item['name']['lname'])
  
# 2. Display the details of student who secured highest mark in the course MCA
  
for item in col.find({'course':'MCA'},{'_id':0}).sort({'mark':-1}).limit(1):
    print(item)

# 3. Display all male students who secured A+ grade.

for item in col.find({'gender':'male','grade':'A+'},{'_id':0}):
    print(item)
    
# 4. Display the names of the top three students in Mechanical department.

for item in col.find({'course':'Mechanical'},{'name':1,'_id':0}).sort({'mark':-1}).limit(3):
    print(item)
    
# 5. Display the details of female students [fname,lname,grade,mark,contact] who achieved a mark more than 90.

for item in col.find({'mark':{'$gt':90},'gender':'female'},{'_id':0,'name':1,'grade':1,'mark':1,'contact':1}):
    print(item)
    
# 6. Display the details of students who secured mark, more than 80 but less than 90.

for item in col.find({'mark':{'$gt':80,'$lt':90}},{'_id':0}):
    print(item)

# 7. Display the details of students whose name starts with 'V'

for item in col.find({'name.fname':{'$regex':'^V'}},{'_id':0}):
    print(item)
    
# 8. Display all students from Kollam

for item in col.find({'address.city':'Kollam'},{'_id':0}):
    print(item)
    
# 9. Display all students who does not belong to neither Kollam nor Thiruvananthapuram

for item in col.find({'address.city':{'$nin':['Kollam','Thiruvananthapuram']}},{'_id':0}):
    print(item)
    
# 10. Display all female students who belong to either Kollam or Thiruvananthapuram

for item in col.find({'gender':'female','address.city':{'$in':['Kollam','Thiruvananthapuram']}},{'_id':0}):
    print(item)

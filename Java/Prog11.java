class Employee{
    int id;
    String name;
    double salary;
    String address;
    Employee(int id,String name,double salary,String address){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
    void display(){
        System.out.println("Employee details: ");
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
        System.out.println("Address: "+this.address);
    }
}
class Teacher extends Employee{
    String dept;
    int subjectcode;
    String subjectname;
    Teacher(int id,String name,double salary,String address,String dept,int subjectcode,String subjectname){
        super(id,name,salary,address);
        this.dept=dept;
        this.subjectcode=subjectcode;
        this.subjectname=subjectname;
    }
    void display(){
        System.out.println("Teacher details: ");
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
        System.out.println("Address: "+this.address);
        System.out.println("Department: "+this.dept);
        System.out.println("Subject Code: "+this.subjectcode);
        System.out.println("Subject Name: "+this.subjectname);
    }
}
public class Prog11 {
    public static void main(String args[]){
        Teacher reshma=new Teacher(12,"Reshma",20000,"Perukavu","MCA",105,"Computer Networking");
        reshma.display();
    }
}

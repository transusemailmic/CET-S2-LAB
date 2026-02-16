class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
}
public class Prog8 {
    public static void main(String args[]){
        Student[] s={new Student(1,"Abel"),new Student(2,"Bobby"),new Student(2,"Carl")};
        for(int i=0;i<s.length;i++){
            System.out.println("Roll No: "+s[i].rollno+" Name: "+s[i].name);
        }
    }
}

class Person{
    void displayPerson(){
        System.out.println("I am a person");
    }
}
class Employee extends Person{
    void displayEmployee(){
        System.out.println("I am an employee");
    }
}
class Manager extends Employee{
    void displayManager(){
        System.out.println("I am a manager");
    }
}
public class Prog12 {
    public static void main(String args[]){
        Manager bob=new Manager();
        System.out.println("I am Bob");
        bob.displayPerson();
        bob.displayEmployee();
        bob.displayManager();
    }
}

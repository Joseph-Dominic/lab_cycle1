class Employee{
    public void calculatesalary(){
        System.out.println("Calculating Salary (Employee class)");
    }
}

class Manager extends Employee{
    public void calculatesalary(){
        System.out.println("Calculating Salary (Manager class)");
    }
}

class Developer extends Employee{
    public void calculatesalary(){
        System.out.println("Calculating Salary (Developer)");
    }
}

class Intern extends Employee{
    public void calculatesalary(){
        System.out.println("Calculating Salary (Intern)");
    }
}

public class superclass {
    public static void main(String[] args){

        Employee emp;

        emp = new Manager();
        emp.calculatesalary();

        emp = new Developer();
        emp.calculatesalary();
    }
}
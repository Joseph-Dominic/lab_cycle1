import java.util.Scanner;

class Employee1{
    private int empID;
    private String name;
    private int salary;

    public void setEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee ID: ");
        this.empID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Employee Name: ");
        this.name = sc.nextLine();

        System.out.print("Enter the Employee Salary: ");
        this.salary = sc.nextInt();
    }

        public int getempID(){
            return empID;
        }
        public String getname(){
            return name;
        }
        public int getsalary(){
            return salary;
        }
}

 class EmployeeUtility{

    public static void displayEmployee(Employee1 e){
        System.out.println("Displaying Details");
        System.out.println("Employee ID: " + e.getempID());
        System.out.println("Employee Name: " + e.getname());
        System.out.println("Employee Salary: " + e.getsalary());
    }
}

public class Exam3{
    public static void main(String[] args){
        Employee1 emp = new Employee1();
        emp.setEmployee();
        EmployeeUtility.displayEmployee(emp);
    }
}
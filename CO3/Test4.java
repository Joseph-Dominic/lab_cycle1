class Employee {
    String company;
    Employee(String company) {
        this.company = company;
    }
    void displayCompany() {
        System.out.println(company);
    }
}

class Manager extends Employee {
    String department;
    Manager(String company, String department) {
        super(company);
        this.department = department;
    }
    void display() {
        super.displayCompany();
        System.out.println("Department : " + department);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Manager m = new Manager("ABC Pvt Ltd", "HR");
        m.display();
    }
}


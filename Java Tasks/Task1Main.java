// Abstract base class for all types of students
abstract class StudentEvaluation {
    protected String name;
    protected int rollNo;

    // Constructor to set student details
    public StudentEvaluation(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }

    // Abstract methods to be implemented by child classes
    public abstract double calculateTotal();
    public abstract void displayGrade();
}

// Subclass for Undergraduate Course
class UGCourseEvaluation extends StudentEvaluation {
    private double theory;
    private double practical;

    public UGCourseEvaluation(String name, int rollNo, double theory, double practical) {
        super(name, rollNo);
        this.theory = theory;
        this.practical = practical;
    }

    @Override
    public double calculateTotal() {
        return (theory * 0.70) + (practical * 0.30);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotal();
        if (total >= 80) {
            System.out.println("Grade        : A");
        } else if (total >= 60) {
            System.out.println("Grade        : B");
        } else if (total >= 50) {
            System.out.println("Grade        : C");
        } else {
            System.out.println("Grade        : F");
        }
    }
}

// Subclass for Postgraduate Course
class PGCourseEvaluation extends StudentEvaluation {
    private double internal;
    private double external;

    public PGCourseEvaluation(String name, int rollNo, double internal, double external) {
        super(name, rollNo);
        this.internal = internal;
        this.external = external;
    }

    @Override
    public double calculateTotal() {
        return (internal * 0.40) + (external * 0.60);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotal();
        if (total >= 85) {
            System.out.println("Grade        : A+");
        } else if (total >= 70) {
            System.out.println("Grade        : A");
        } else if (total >= 55) {
            System.out.println("Grade        : B");
        } else {
            System.out.println("Grade        : F");
        }
    }
}

// Subclass for Certificate Course
class CertificateCourseEvaluation extends StudentEvaluation {
    private double assignment;
    private double finalExam;

    public CertificateCourseEvaluation(String name, int rollNo, double assignment, double finalExam) {
        super(name, rollNo);
        this.assignment = assignment;
        this.finalExam = finalExam;
    }

    @Override
    public double calculateTotal() {
        return (assignment * 0.50) + (finalExam * 0.50);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotal();
        if (total >= 75) {
            System.out.println("Grade        : Distinction");
        } else if (total >= 50) {
            System.out.println("Grade        : Pass");
        } else {
            System.out.println("Grade        : Fail");
        }
    }
}

// Subclass for Diploma Course (Added without touching base class)
class DiplomaEvaluation extends StudentEvaluation {
    private double exam;
    private double project;

    public DiplomaEvaluation(String name, int rollNo, double exam, double project) {
        super(name, rollNo);
        this.exam = exam;
        this.project = project;
    }

    @Override
    public double calculateTotal() {
        return (exam * 0.60) + (project * 0.40);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotal();
        if (total >= 75) {
            System.out.println("Grade        : A");
        } else if (total >= 60) {
            System.out.println("Grade        : B");
        } else if (total >= 50) {
            System.out.println("Grade        : C");
        } else {
            System.out.println("Grade        : F");
        }
    }
}

// Main Class
public class Task1Main {
    public static void main(String[] args) {
        // Array holding 5 student objects
        StudentEvaluation[] students = new StudentEvaluation[5];

        students[0] = new UGCourseEvaluation("Arun", 101, 80, 90);
        students[1] = new PGCourseEvaluation("Meera", 102, 85, 75);
        students[2] = new CertificateCourseEvaluation("Rahul", 103, 70, 80);
        students[3] = new UGCourseEvaluation("Anjali", 104, 65, 75);
        students[4] = new DiplomaEvaluation("Nikhil", 105, 78, 85);

        // Display details using a simple loop
        for (StudentEvaluation student : students) {
            System.out.println("\n-----------------------------");
            student.displayDetails();
            System.out.println("Total Marks  : " + student.calculateTotal());
            student.displayGrade();
        }
    }
}
class Student {
    int id;

    Student(int i) {
        id = i;
    }

    // Suppress the warning so your console stays clean
    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("Object removed " + id);
    }
}

class GarbageDemo {
    public static void main(String args[]) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);

        // Making objects eligible for Garbage Collection
        s1 = null;
        s2 = null;

        System.out.println("Requesting Garbage Collection...");
        System.gc(); 

        // Pause the main thread for 1 second to let GC finish
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("End");
    }
}
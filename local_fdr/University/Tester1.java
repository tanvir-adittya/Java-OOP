package local_fdr.University;

public class Tester1 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Bob", "11");

        //s1.showDetail();
        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        //System.out.println("Age: " + s1.age);
        System.out.println("CGPA: " + s1.cgpa);

        // Public -> Yes    Private -> No
        // Default -> Yes   Protected -> Yes

    }
}

package local_fdr.University;

public class Student {
    
    public String name;
    String id;
    private int age;
    protected double cgpa;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void showDetail() {

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

    }

}

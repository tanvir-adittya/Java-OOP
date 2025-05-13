public class Student { // Blueprint
    
    public String name; // instance varible
    private int id = 100; // instance varible
    public double cgpa;
    public Course[] courses = new Course[5];
    public int courseCount = 0;

    public Student() { // no-parameterized or default constructor
        System.out.println("no parameter I was called");
    }

    public Student(String name, int id) { // parameterized constructor
        
        //System.out.println(" 2 parameter I was called");

        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, double cgpa) { // parameterized constructor
        
        //System.out.println(" 3 parameter I was called");

        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void makeCall(Student obj) {

        System.out.println("I am " + name);
        System.out.println("Hey, " + obj.name);
        System.out.println("Sir is calling you");
    }

    public void addCourse(Course c) {

        courses[courseCount] = c;
        courseCount++;
    }

    public void showDetail() { // instance methode
        
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course taken:");

        for(int i=0; i < courseCount; i++) {

            System.out.println(courses[i].code);
            System.out.println(courses[i].title);
        }
    }

    public void standUp() { // instance methode
        System.out.println(name + " is now standing.");
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID given");
        }    
    }

    public int getID() {
        return id;
    }

}

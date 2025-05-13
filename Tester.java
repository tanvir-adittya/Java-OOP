import University.*;

public class Tester {
    public static void main(String[] args) {
        
        // Classname varible = new Classname()
        // Student s1 = new Student(); // Object/instance1
        // Student s2 = new Student(); // Object/instance2

        // s1.name = "Bob";
        // s1.id = "11";
        // s2.name = "Carol";
        // s2.id = "33";

        // s1.standUp();
        // s2.standUp();

        // s1.showDetail();
        // System.out.println("========");
        // s2.showDetail();
        
        // House h1 = new House();
        // House h2 = new House();

        // h1.window = 6;
        // h1.door = 2;
        // System.out.println("h1======");
        // h1.view();

        // h2.window = 4;
        // h2.door = 2;
        // System.out.println("h2======");
        // h2.view();

        // h1.increaseDoor(1);
        // System.out.println("h1======");
        // h1.view();

        // h2.increaseDoor(2);
        // System.out.println("h2======");
        // h2.view();

        // Cat c1 = new Cat();
        // Cat c2 = new Cat();

        // c1.color = "White";
        // c2.color = "purple";

        // System.out.println("c1=======");
        // c1.detail();
        
        // System.out.println("c2=======");
        // c2.detail();

        // c1.changeAction("jumping");
        // System.out.println("c1=======");
        // c1.detail();

        // myCalculator c1 = new myCalculator();

        // int ans = c1.add(3, 4);
        // System.out.println(ans);

        // Dog d1 = new Dog();

        // d1.name = "Rover";

        // d1.bark();
        // d1.eat("bread");
        // d1.eat("bread", 3);
        // d1.eat("bread", "meat");

        // myCalculator c1 = new myCalculator();

        // System.out.println(c1.add(4.5, 2));
        // System.out.println(c1.add("OOP", "is fun"));
        // System.out.println(c1.add(5.5, 9.6));
        // System.out.println(c1.add(4, 5, 6));

        // Student s1 = new Student("Bob", 11);
        // Student s2 = new Student("Carol", 33);
        // Student s3 = new Student();
        // Student s4 = new Student("David", 55, 4.0);

        // s1.showDetail();
        // s2.showDetail();
        // s3.showDetail();
        // s4.showDetail();

        // Car c1 = new Car();
        // Car c2 = new Car("BMW", "M8");
        // Car c3 = new Car("Toyota", "Premio");
        // Car c4 = new Car("Audi", "R8", 2019);

        // c1.details();
        // c2.details();
        // c3.details();
        // c4.details();

        // Student s1 = new Student("Bob", 11);
        // Student s2 = new Student("Carol", 33);

        // s1.makeCall(s2); // Pass by reference

        // Student s1 = new Student("Bob", 11);

        // Course c1 = new Course("CSE111", "Object Oriented Programming");
        // Course c2 = new Course("MAT120");

        // s1.addCourse(c1);
        // s1.addCourse(c2);

        // s1.showDetail();

        // University.Student s1 = new University.Student("Bob", "11");

        // s1.showDetail();
        // System.out.println("Name: " + s1.name);
        //System.out.println("ID: " + s1.id);
        //System.out.println("Age: " + s1.age);
        //System.out.println("CGPA: " + s1.cgpa);

        // Public -> Yes    Private -> No
        // Default -> No   Protected -> No

        // Student s1 = new Student("Bob", 11);

        // s1.setId(55);
        // System.out.println(s1.getID()); 

        // s1.showDetail();

        // Student s1 = new Student("Bob", 11);
        // Student s2 = new Student("Carol", 33);

        // s1.showDetail();
        // s2.showDetail();

        // System.out.println("Teamrun: " + Player.teamRun);

        // Player sakib = new Player();
        // Player tamim = new Player();

        // tamim.hitFour();
        // tamim.hitFour();
        // sakib.hitSix();

        // System.out.println("Sakib run: " + sakib.run);
        // System.out.println("Tamim run: " + tamim.run);
        // System.out.println("Teamrun: " + Player.teamRun);

        System.out.println("Total student: " + Student.count);

        Student s1 = new Student("Bob", 11);
        Student s2 = new Student("Carol", 33);

        System.out.println("Total student: " + Student.count);

    }
}
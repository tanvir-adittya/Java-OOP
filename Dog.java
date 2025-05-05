// Methode overloading

public class Dog {
    
    public String name;

    public void eat(String fd) {
        System.out.println(name + " is eating " + fd);
    }

    public void eat(String fd, int n) {
        System.out.println(name + " is eating " + n + " " + fd);
    }

    public void eat(String fd1, String fd2) {
        System.out.println(name + " is eating " + fd1 + " and " + fd2);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

}

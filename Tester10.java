public class Tester10 {

    public static void displayInfo(Animal4 a) {
        a.makeSound();
        // a.bark(); // this will give an error
    }

    public static void main(String[] args) {
        
        Animal4 a1 = new Animal4();
        Dog4 d1 = new Dog4();
        Cat2 c1 = new Cat2();

        // reference_type var = new object()
        // Dog4 d1 = new Dog4();
        // Animal4 a1 = (Animal4)d1; //Upcasting
        // a1.makeSound();

        displayInfo(d1);
        // displayInfo(c1);

    }
}

public class Tester11 {

    public static void displayInfo(Animal5 a) {

        if(a instanceof Dog5) {
            Dog5 d = (Dog5) a;
            d.makeSound();
            d.bark();
        } else {
            a.makeSound();
        }

    }

    public static void main(String[] args) {
        
        Animal5 a1 = new Animal5();
        Dog5 d1 = new Dog5();
        Cat3 c1 = new Cat3();

        displayInfo(d1);
        displayInfo(c1);
        displayInfo(a1);

    }
}

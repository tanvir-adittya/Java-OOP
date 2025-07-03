public class Dog3 extends Animal2 {
    
    public String color;

    public Dog3(String nm, String clr) {
        super(nm);
        color = clr;
    }

    public void bark() {
        System.out.println(color + " " + name + " is barking");
    }

    // public String toString() {
    //     return "I am a dog";
    // }

}

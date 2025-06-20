public class Dog1 extends Animal {

    public String color;
    
    public Dog1(String nm, String clr) {
        super(nm);
        color = clr;
    }

    public void bark() {
        System.out.println(color + " " + name + " is barking");
    }

}

public class Dog2 extends Animal1 {
    
    public String color;

    public Dog2(String nm, String clr) {
        super(nm);
        color = clr;
    }

    public void eat() {
        super.eat();
        System.out.println(name + " is eating meat");
        super.eat();
    }

    public void bark() {
        System.out.println(color + " " + name + " is barking");
    }

}

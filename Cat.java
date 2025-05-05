public class Cat {
    
    public String color;
    public String action = "sitting"; // instance varible

    public void changeAction(String action) {
        this.action = action; // action inside methode is local varible
    }

    public void detail() {
        System.out.println(color + " cat is " + action);
    }

}

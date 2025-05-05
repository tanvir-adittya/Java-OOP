public class myCalculator {

    public int result;

    public int add(int n1, int n2) {
        result = n1 + n2;
        return result;
    }

    public double add(double n1, double n2) {
        System.out.println("double double");
        return n1 + n2;
    }

    public String add(String n1, String n2) {
        System.out.println("String String");
        return n1 + " " + n2;
    }

    public int add(int n1, int n2, int n3) {
        System.out.println("int int int");
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        System.out.println("double int");
        return n1 + n2;
    }

}
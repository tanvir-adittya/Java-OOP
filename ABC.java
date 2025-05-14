public class ABC {
    
    public int temp;
    public static int x = 4;

    public ABC(int val) {
        temp = val;
    }

    public void methode1() {

        int temp = 5; // local varible
        int x = 6;    // local varible
        
        System.out.println(temp); // local
        System.out.println(x);    // local
        System.out.println(this.temp); // instance
        System.out.println(ABC.x);     //static
        System.out.println("========");
    }

}

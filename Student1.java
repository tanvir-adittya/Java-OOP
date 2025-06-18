public class Student1 {
    
    public String name;
    public int id;
    private static String uniNname = "MEC";

    public Student1(String n, int i) {
        name = n;
        id = i;
    }

    public static void upUniName(String uname) { // static methode
        uniNname = uname;
        // System.out.println("static upUniName was called");
        // m1();
    }

    // public static void m1() { // static methode
    //     System.out.println("Static m1 was called");
    // }

    public void showDetail() { // instance methode

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University name: " + uniNname);

    }

}

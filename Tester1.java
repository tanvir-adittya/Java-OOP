public class Tester1 {
    public static void main(String[] args) {
        
        Student1 s1 = new Student1("Bob", 11);
        Student1 s2 = new Student1("Carol", 33);
        Student1 s3 = new Student1("David", 55);

        // Student1.uniNname = "Mymensingh Engineering College";
        Student1.upUniName("Mymensingh Engineering College");

        s1.showDetail();
        s2.showDetail();
        s3.showDetail();

    }
}

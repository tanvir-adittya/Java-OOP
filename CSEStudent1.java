public class CSEStudent1 extends Student3 {

    public int numOfLabs;

    public CSEStudent1(String nm, int i, int lab) {
        super(nm, i);
        numOfLabs = lab;
    }

    public void cry() {
        System.out.println(name + " is crying because of " + numOfLabs + " Labs");
    }
    
}

public class CSEStudent2 extends Student4 {
    
    public int numOfLabs;
    public CSEStudent2(String nm, int i, int lab) {
        super(nm, i);
        numOfLabs = lab;
    }

    public void cry() {
        System.out.println(name + " is crying because of " + numOfLabs + " labs");
    }

}

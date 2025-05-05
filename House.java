public class House {
    
    public int window;
    public int door;

    public void increaseDoor(int dr) { // local varible
        door += dr;
    }

    public void view() {
        System.out.println(window + " Wondows");
        System.out.println(door + " Doors");
    }

}

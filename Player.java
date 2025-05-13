public class Player {
    
    public int run = 0; // instance varible
    public static int teamRun = 0; // static varible

    public void hitFour() {
        run += 4;
        teamRun += 4;
    }

    public void hitSix() {
        run += 6;
        teamRun += 6;
    }

}

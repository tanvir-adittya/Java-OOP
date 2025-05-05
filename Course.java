public class Course {
    
    public String code;
    public String title;

    public Course(String cd, String ti) {
        code = cd;
        title = ti;
    }

    public Course(String cd) {
        code = cd;
        title = "Not selected yet";
    }

}

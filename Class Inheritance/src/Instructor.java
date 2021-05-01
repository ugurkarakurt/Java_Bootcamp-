public class Instructor extends User {
    private String takeCourse;

    public String getTakeCourse() {
        return takeCourse;
    }

    public void setTakeCourse(String takeCourse) {
        this.takeCourse = takeCourse;
    }

    @Override
    public void get() {
        System.out.println(getFirstName() + "asdad");    }

}

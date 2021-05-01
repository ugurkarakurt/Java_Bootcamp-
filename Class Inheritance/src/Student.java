public class Student extends User {
    private String giveCourse;

    public String getGiveCourse() {
        return giveCourse;
    }

    public void setGiveCourse(String giveCourse) {
        this.giveCourse = giveCourse;
    }

    @Override
    public void get() {
        System.out.println(getFirstName() + "asdad");    }

}

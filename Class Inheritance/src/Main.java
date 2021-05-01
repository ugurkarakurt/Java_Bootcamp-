public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Ugur");
        student1.setLastName("Karakurt");
        student1.setUserNumber("0001");
        student1.setGiveCourse("Java");

        Instructor instructor1 = new Instructor();
        instructor1.setId(2);
        instructor1.setFirstName("Mustafa Murat");
        instructor1.setLastName("Coşkun");
        instructor1.setUserNumber("0002");
        instructor1.setTakeCourse("Java");

        UserManager userManager = new UserManager();
        userManager.get(new Instructor());
        userManager.get(new Student());

        System.out.println("------------------");
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " adlı öğrenci çağırıldı");
        System.out.println(instructor1.getFirstName() + " " + instructor1.getLastName() + " adlı eğitmen çağırıldı.");
        System.out.println("------------------");

    }
}

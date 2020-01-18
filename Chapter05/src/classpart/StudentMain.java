package classpart;

public class StudentMain {

    public static void main(String[] args) {
        classpart.Student student = new classpart.Student();
        student.id = 1234;
        student.name = "김소연";
        student.address = "인천광역시";

        student.printInfo();
    }
}

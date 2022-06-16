import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collections {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            Random random = new Random();
            Student student = new Student();
            student.setName("Ivan");
            student.setAge(random.nextInt(17,21));
            studentList.add(student);
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

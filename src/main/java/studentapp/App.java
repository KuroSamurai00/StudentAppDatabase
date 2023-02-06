package studentapp;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    

    public static void main(String[] args) throws Exception {

        ArrayList<Student> studentsList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        Student studentTest = new Student("Matthew", "Johnson", 4);


        System.out.println("Welcome To student application!");

        studentTest.viewStatus();
        studentTest.addCourse(4);
        studentTest.getBalance();
        studentTest.payTuition(200);
        studentTest.getBalance();
        studentTest.addCourse(1);
        studentTest.addCourse(2);
        
        studentTest.payTuition(700);

        studentTest.viewStatus();

        System.out.println("How many Students are being added?: ");
        int numOfStudents = in.nextInt();

        for(int i = 0; i < numOfStudents; i++){
            Student student = new Student();
            studentsList.add(student);
        }

        studentsList.get(0).viewStatus();
        studentsList.get(1).viewStatus();

        

    }
}

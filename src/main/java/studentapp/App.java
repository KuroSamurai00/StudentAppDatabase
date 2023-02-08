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

        
        System.out.println("How many Students are being added?: ");
        int numOfStudents = in.nextInt();

        for(int i = 0; i < numOfStudents; i++){
            Student student = new Student();
            studentsList.add(student);
        }

        studentsList.get(0).viewStatus();
        studentsList.get(0).addCourse(4);

        studentsList.get(0).viewStatus();


        

    }
}

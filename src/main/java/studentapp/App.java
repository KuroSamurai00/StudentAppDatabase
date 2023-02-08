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
        Boolean exitBool = false; 

        ArrayList<Student> studentsList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome To student application!");

        //adding students to database
        System.out.println("How many Students are being added?: ");
        int numOfStudents = in.nextInt();

        for(int i = 0; i < numOfStudents; i++){
            Student student = new Student();
            studentsList.add(student);
        }
        //Menu select
        do{
            Scanner input = new Scanner(System.in);

            System.out.println(":::::::::::::_______________::::::::::::");
            System.out.println("1: View Student Status");
            System.out.println("2: Pay Balance");
            System.out.println("3: Add Class");
            System.out.println("4: View Student Status");
            System.out.println("5: View Student Status");
            System.out.println(":::::::::::::_______________::::::::::::");

            try {
                int choice = in.nextInt();

                switch(choice){
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    default: break;
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }

        }while(exitBool != true);

     

        

    }
}

package studentapp;
import java.util.ArrayList;
import java.util.Scanner;


public class Student {
   private static int globalID = 1000;

    private String fName = "";
    private String lName = "";
    private String id = "";

    private ArrayList<String> classList = new ArrayList<>();
   

    private double balance = 0; 
    private int studentYear = 0;

    MongoDB database = new MongoDB();

    public Student(String fNameIn, String lNameIn, int yearIn){
        fName = fNameIn;
        lName = lNameIn;
        studentYear = yearIn;
        id += yearIn + "" + globalID + ""; 
        globalID++; 

    }

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Student First name: ");
        this.fName = in.nextLine();

        System.out.println("Student Last name: ");
        this.lName = in.nextLine();

        System.out.println("Student year (1: freshman, 2: sophmore, 3: junior, 4: senior): ");
        this.studentYear = in.nextInt();

        id += this.studentYear + "" + globalID + ""; 

        globalID++; 

       

        database.addStudent(this.fName, this.lName, this.id);



    }


    public void addCourse(int courseNumber){
        switch(courseNumber){
            case 0: classList.add("History 101"); balance += 600; database.updateBalance(600.00, id);     break;
            case 1: classList.add("Math 101");  balance += 600; database.updateBalance(600.00, id); break;
            case 2: classList.add("English 101"); balance += 600; database.updateBalance(600.00, id); break;
            case 3: classList.add("Chemistry 101"); balance += 600; database.updateBalance(600.00, id); break;
            case 4: classList.add("Computer Science 101"); balance += 600;  database.updateBalance(600.00, id); break;

            default: System.out.println("A class was not selected/Added"); break; 
        }


    } 

    public void getBalance(){
       System.out.println(balance);}
    
    public void payTuition(double payment){
        this.balance -= payment; 
        database.updateBalance(this.balance, id);

    }

    public void viewStatus(){ 

        System.out.println( "First Name: " + fName + "\n" +
                "Last Name: " + lName + "\n" +
                "Student ID: " + id + "\n" +
                "Balance: " + balance + "\n" + 
                "Classes: " +  classList ) ;

            }

}

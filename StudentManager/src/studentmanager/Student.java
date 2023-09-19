package studentmanager;


import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private ArrayList<Integer> ID = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();
    private ArrayList<String> email = new ArrayList<>();
    private ArrayList<String> course = new ArrayList<>();



    public String[] returnStudentInfoArr(Integer index) {


        String name = this.name.get(index);
        String age = this.age.get(index).toString();
        String email = this.email.get(index);
        String course = this.course.get(index);
        


        String[] info = {name, age, email, course};

        return info;
        
    }









    public Student() {
        this.ID.add(10111);
        this.name.add("Abdul Baari");
        this.age.add(19);
        this.email.add("abdulbaaridavids04@gmail.com");
        this.course.add("BCAD2303");
    }

    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

    public void capture(String[] studentInfo) {

        ID.add(ID.get(ID.size() - 1) + 1);
        name.add(studentInfo[0]);
        age.add(Integer.parseInt(studentInfo[1]));
        email.add(studentInfo[2]);
        course.add(studentInfo[3]);
    }

    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

    public void captureStudentInfo() {

        System.out.println("Capture Student\n****************");
        Scanner capture = new Scanner(System.in);

        String[] studentinfo = { "Name", "Age", "Email", "Course" };
        String studentAge = "";
        String studentName = "";
        String studentEmail = "";
        String studentCourse = "";

        System.out.println("Please Enter Student Name: ");
        studentName = capture.nextLine();

        System.out.println("Please enter student age: ");

        boolean ageCaptured = false;
        while (!ageCaptured) {

            studentAge = capture.nextLine();

            if (checkStudentAge(studentAge)) {
                ageCaptured = true;
            } else {
                System.out.println("Invalid Age. Please enter the correct student age >>");
            }

        }

        System.out.println("Please Enter Email: ");
        studentEmail = capture.next();

        System.out.println("Please Enter Course: ");
        studentCourse = capture.next();

        studentinfo[0] = studentName;
        studentinfo[1] = studentAge;
        studentinfo[2] = studentEmail;
        studentinfo[3] = studentCourse;

        capture(studentinfo);
    }

    // ---------------------------------------------------------------------------------------------


public static boolean checkStudentAge(String age) {

    try {
        if (Integer.parseInt(age) >= 16){
            return true;
        }
    
        
    } catch (Exception e) {
        return false;
    }
   return false;

    
}






    // ---------------------------------------------------------------------------------------------

    public String ShowStudents() {

        StringBuilder report = new StringBuilder();

        report.append("Student Report");
        report.append(System.lineSeparator());
        report.append("************************************");
        report.append(System.lineSeparator());

        for (int i = 0; i < ID.size(); i++) {
            report.append("Name: " + name.get(i));
            report.append(System.lineSeparator());
            report.append("ID: " + ID.get(i));
            report.append(System.lineSeparator());
            report.append("Age: " + age.get(i));
            report.append(System.lineSeparator());
            report.append("Email: " + email.get(i));
            report.append(System.lineSeparator());
            report.append("Course: " + course.get(i));
            report.append(System.lineSeparator());
            report.append("************************************");
            report.append(System.lineSeparator());

        }
        report.append("************************************");

        return report.toString();
    }

    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------



    public void delete(Integer index){

        this.ID.remove(index);
        this.name.remove(index);
        this.age.remove(index);
        this.email.remove(index);
        this.course.remove(index);
        
    }


// ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------









    public String deleteStudents(String studentID) {
        
        System.out.println("Please Enter the ID of the student you would like to delete: ");
        String delete = studentID;

        if (ID.indexOf(Integer.parseInt(delete)) == -1) {

            return "Student " + delete + " does not exist. Press any key to return to the main menu";
        } else {

            if (menu.deleteConfirmation(Integer.parseInt(delete))) {
                Display.clearDisplay();

                delete(this.ID.indexOf(Integer.parseInt(studentID)));

                return delete + " has been successfully deleted!";
            }

            return "";
        }

    }


    // ---------------------------------------------------------------------------------------------


    public Boolean IDexists(String ID) {

        if (this.ID.indexOf(Integer.parseInt(ID)) == -1) {

            return false;
        } else {

            return true;

        }

    }



//--------------------------------------------------------------------------------------



    public String searchStudent(String ID) {


        try {
            if (!IDexists(ID)){
                return "Student not Found";
            } else {
    
                int i = this.ID.indexOf(Integer.parseInt(ID));
    


                StringBuilder str = new StringBuilder();
                str.append("Name: " + name.get(i));
                str.append(System.lineSeparator());
                str.append("ID: " + this.ID.get(i));
                str.append(System.lineSeparator());
                str.append("Age: " + age.get(i));
                str.append(System.lineSeparator());
                str.append("Email: " + email.get(i));
                str.append(System.lineSeparator());
                str.append("Course: " + course.get(i));
                str.append(System.lineSeparator());
                str.append("************************************");
                str.append(System.lineSeparator());
    
    
                
    
                return str.toString();
    
    
                
            }
        } catch (Exception e) {
            return "Error Invalid ID";
        }

        

        
    }

    // ---------------------------------------------------------------------------------------------


public static void ExitStudentApplication(){
    System.exit(0);
}

    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

}


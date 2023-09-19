/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanager;

import java.util.Scanner;


public class StudentManager {
    public static void main(String[] args) {

        boolean exit = false;
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        while (!exit) {

            if (menu.intro()) {

                while (!exit) {
                    switch (menu.showMenu()) {
                        case 1:
                            Display.clearDisplay();
                            student.captureStudentInfo();

                            break;
                        case 2:
                            Display.clearDisplay();
                            System.out.println("Enter Student ID");
                            System.out.println(student.searchStudent(input.next()));


                            System.out.println("Press any key to continue");
                            input.next();

                            break;

                        case 3:
                            Display.clearDisplay();
                            System.out.println("Please Enter the ID of the student you would like to delete: ");

                            System.out.println(student.deleteStudents(input.nextLine()));


                            Display.clearDisplay();
                            System.out.println("Press any key to return to the main menu.");
                            input.next();
                            break;

                        case 4:
                            Display.clearDisplay();
                            System.out.println(student.ShowStudents()); 

                            System.out.println("Press any key to return to the main menu.");
                            input.next();
                            break;

                        case 5:
                            Display.clearDisplay();
                            System.out.println("Goodbye");
                            input.close();
                            Student.ExitStudentApplication();

                            break;

                        default:
                            Display.clearDisplay();
                            System.out.println("Error");

                            break;

                    }
                }

            } else {

                
                exit = true;
                return;
            }

        }

    }

}

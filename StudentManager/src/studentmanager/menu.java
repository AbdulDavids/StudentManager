/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

import java.util.Scanner;

public class menu {

    // displays menu and returns choice as an int
    public static int showMenu() {
        Display.clearDisplay();
        String prompt = "Please select one of the following menu items:\n (1) Capture a new student \n (2) Search for a student\n (3) Delete a Student\n (4) Show Student report\n (5) Exit application";

        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();

        try {
            int ans = Integer.parseInt(answer);
            return ans;

        } catch (Exception e) {

            return 0;
        }

    }

    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

    public static boolean intro() {
        Display.clearDisplay();
        System.out.println(
                "STUDENT MANAGEMENT APPLICATION\n**********************************************\nEnter (1) to launch menu or any other key to exit");

        Scanner scan = new Scanner(System.in);

        try {
            int answer = scan.nextInt();
            if (answer == 1) {

                return true;
            } else {

                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

    public static Boolean deleteConfirmation(int studentID) {
        Scanner confirm = new Scanner(System.in);
        System.out.println("Are you sure you want to delete " + studentID + "? y/n  >>>");
        
        String choice = confirm.next().toLowerCase();

        if (choice == "y") {
            return true;
        } else {
            return false;
        }

    }

}


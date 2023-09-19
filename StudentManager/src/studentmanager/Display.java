/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

public class Display {

    //Simple function to clear terminal
    public static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

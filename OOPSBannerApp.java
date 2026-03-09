package StepUp_UC_Assignments;

/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * Goal: Combine array declaration and initialization with String.join() 
 * to create a more compact and readable structure.
 * @author Krish Aravind
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] lines = {
        String.join(" ","  *****    " ,"  *****  ","  ******  ","   *****  "),
        String.join(" "," **   **   " ," **   ** ","  **   ** "," **    ** "),
        String.join(" ","**     **  " ,"**     **","  **   ** "," **       "),
        String.join(" ","**     **  " ,"**     **","  ******  ","  ******  "),
        String.join(" ","**     **  " ,"**     **","  **      ","       ** "),
        String.join(" "," **   **   " ," **   ** ","  **      "," **     **"),
        String.join(" ","  *****    " ,"  *****  ","  **      ","  ******  "),
    };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}   
package StepUp_UC_Assignments;

/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
        - using a list along with String.join() and printing with a loop
 * @author Krish Aravind
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] lines = {
        String.join(" ","  *****    " ,"  *****  ","  ******   ","   *****  "),
        String.join(" "," **   **   " ," **   ** ","  **   **  "," **    ** "),
        String.join(" ","**     **  " ,"**     **","  **   **  "," **       "),
        String.join(" ","**     **  " ,"**     **","  ******   ","  ******  "),
        String.join(" ","**     **  " ,"**     **","  **       ","       ** "),
        String.join(" "," **   **   " ," **   ** ","  **       "," **     **"),
        String.join(" ","  *****    " ,"  *****  ","  **       ","  ******  "),
    };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}   
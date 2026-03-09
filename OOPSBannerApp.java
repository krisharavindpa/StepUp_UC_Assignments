package StepUp_UC_Assignments;

public class OOPSBannerApp {
    public static void main(String[] args) {
        // Retrieve patterns from modular helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print each line of the banner
        for (int i = 0; i < oPattern.length; i++) {
            // Concatenate patterns with a space between letters for alignment
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }

    // Modular methods return String arrays for each letter
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ******   ",
            " **    ** ",
            " **     **",
            " **    ** ",
            " ******   ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  ******  ",
            " **       ",
            " **       ",
            "  *****   ",
            "      **  ",
            "       ** ",
            " ******   "
        };
    }
}
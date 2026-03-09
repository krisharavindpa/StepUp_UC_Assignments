import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 * * This implementation improves upon UC7 by using a HashMap for O(1) retrieval 
 * of character patterns, eliminating the need for manual linear searches.
 * * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        });

        // Pattern for 'P'
        charMap.put('P', new String[] {
            " ******   ",
            " **    ** ",
            " **     **",
            " **    ** ",
            " ******   ",
            " **       ",
            " **       ",
            " **       "
        });

        // Pattern for 'S'
        charMap.put('S', new String[] {
            "   ****** ",
            " **       ",
            " **       ",
            "   *****  ",
            "        **",
            "        **",
            "  ******  "
        });

        return charMap;
    }

    /**
     * Renders the message as a large ASCII banner.
     * Logic: Iterates through each "row" of the patterns, then through each 
     * character in the message to build that row horizontally.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        if (message == null || message.isEmpty() || charMap.isEmpty()) {
            return;
        }

        // Assuming all patterns have the same height based on the first character 'O'
        int patternHeight = charMap.get('O').length;

        // Outer loop: Iterate through each line (row) of the ASCII height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            // Inner loop: Iterate through each character in the input message
            for (char ch : message.toUpperCase().toCharArray()) {
                if (charMap.containsKey(ch)) {
                    String[] pattern = charMap.get(ch);
                    sb.append(pattern[line]).append("  "); // Adding space between letters
                }
            }
            // Print the completed line of the banner
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {
        // 1. Initialize the character map
        HashMap<Character, String[]> charMap = createCharacterMap();

        // 2. Define the message to display
        String message = "OOPS";

        // 3. Display the banner
        System.out.println("--- UC8: HashMap ASCII Banner ---\n");
        displayBanner(message, charMap);
    }
}
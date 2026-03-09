package StepUp_UC_Assignments;

/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 * This version uses a CharacterPatternMap class to encapsulate patterns.
 * @author Krish Aravind
 * @version 7.0
 */
public class OOPSBannerApp {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        /**
         * @param character The character to be mapped
         * @param pattern The ASCII art pattern representation
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** @return the character associated with this pattern map */
        public Character getCharacter() { return character; }

        /** @return the pattern array representing the character */
        public String[] getPattern() { return pattern; }
    }

    /**
     * Initializes CharacterPatternMap array for predefined characters.
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
        
        charMaps[0] = new CharacterPatternMap('O', new String[] {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        });
        charMaps[1] = new CharacterPatternMap('P', new String[] {
            " ******   ",
            " **    ** ",
            " **     **",
            " **    ** ",
            " ******   ",
            " **       ",
            " **       ",
            " **       "
        });
        charMaps[2] = new CharacterPatternMap('S', new String[] {
            "   ****** ",
            " **       ",
            " **       ",
            "   *****  ",
            "        **",
            "        **",
            "  ******  "
        });
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "          ", 
            "          ", 
            "          ", 
            "          ", 
            "          ", 
            "          ", 
            "          "});
            
        return charMaps;
    }


    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); 
    }

    /**
     * Renders the message horizontally by combining character patterns line by line.
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Spacing for readability
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Define message and print
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
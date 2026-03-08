class OOPSBannerApp {

    // Static Inner Class to store character and pattern
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        // Constructor
        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter method
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Creating objects for each character
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        // Word to display
        CharacterPatternMap[] word = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }
            System.out.println(line);
        }
    }
}
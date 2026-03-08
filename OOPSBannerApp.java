public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Using String.join with uniform segment widths for perfect alignment
        String[] oops = {
            String.join("  ", " OOO ", " OOO ", "PPPP ", "SSSS "),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "PPPP ", " SSS "),
            String.join("  ", "O   O", "O   O", "P    ", "    S"),
            String.join("  ", " OOO ", " OOO ", "P    ", "SSSS ")
        };

        // Enhanced for loop
        for (String line : oops) {
            System.out.println(line);
        }
    }
}

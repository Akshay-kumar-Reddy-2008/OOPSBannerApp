class OopsBannerApp {

    // Static method for letter O
    static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method for letter P
    static String[] getP() {
        return new String[] {
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Static method for letter S
    static String[] getS() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Print OOPS banner
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}
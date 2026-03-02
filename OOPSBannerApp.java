public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] oops = {
            " OOO    OOO   PPPP    SSSS  ",
            "O   O  O   O  P   P  S      ",
            "O   O  O   O  PPPP    SSS   ",
            "O   O  O   O  P          S  ",
            " OOO    OOO   P      SSSS   "
        };

        // Using loop to print the banner
        for (int i = 0; i < oops.length; i++) {
            System.out.println(oops[i]);
        }
    }
}
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble full banner
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[]{
                "*******",
                "*     *",
                "*     *",
                "*******",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[]{
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        };
    }
}
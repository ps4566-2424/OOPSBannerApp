public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] bannerLines = {

                String.join(" ",
                        "*******",
                        "*******",
                        "*******",
                        "*******"),

                String.join(" ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join(" ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join(" ",
                        "*     *",
                        "*     *",
                        "*******",
                        "*******"),

                String.join(" ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     *"),

                String.join(" ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     *"),

                String.join(" ",
                        "*******",
                        "*******",
                        "*      ",
                        "*******")
        };

               for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

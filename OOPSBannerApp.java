
public class OOPSBannerApp {

  
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

       
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        
        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap buildOPattern() {
        return new CharacterPatternMap('O', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });
    }

    public static CharacterPatternMap buildPPattern() {
        return new CharacterPatternMap('P', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*******",
                "*      ",
                "*      ",
                "*      "
        });
    }

    
    public static CharacterPatternMap buildSPattern() {
        return new CharacterPatternMap('S', new String[]{
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        });
    }

    
    public static void main(String[] args) {

        CharacterPatternMap[] characters = {
                buildOPattern(),
                buildOPattern(),
                buildPPattern(),
                buildSPattern()
        };

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                lineBuilder.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(lineBuilder);
        }
    }
}
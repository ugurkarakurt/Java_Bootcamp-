public class App {
    public static void main(String[] args) {

        CharSet char1 = new CharSet(1, "Luke Skywalker", "Tatooine"); // To create a object from the char class

        CharSet char2 = new CharSet(); // To create an empty object from the char class(This will call the constructor)
        char2.id = 2;
        char2.name = "R2-D2";
        char2.homeworld = "Naboo";

        CharSet char3 = new CharSet();
        char3.id = 2;
        char3.name = "Obi-Wan Kenobi";
        char3.homeworld = "Stewjon";

        CharSet[] chars = { char1, char2, char3 };

        for (CharSet character : chars) {
            System.out.println(character.name + " from " + character.homeworld + "!");
        }

        SaveChars saveChars = new SaveChars();

        saveChars.saveChars(char1);
        saveChars.saveChars(char2);
        saveChars.saveChars(char3);

    }
}

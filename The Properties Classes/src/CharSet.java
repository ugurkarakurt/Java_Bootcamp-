
public class CharSet {
    // Class attributes
    int id;
    String name;
    String homeworld;

    // Class required to make an empty definition
    public CharSet() {
    };

    // The class with the parameters and their conditions
    public CharSet(int id, String name, String homeworld) {
        this();
        this.id = id;
        this.name = name;
        this.homeworld = homeworld;
    };
}
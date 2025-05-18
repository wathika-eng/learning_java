// inheritance
public class Fruit extends Item {
    private String type;

    // write even those from Item
    public Fruit(String type, String name, int quantity) {
        // use super
        super(name, quantity);
        this.type = type;
    }
}

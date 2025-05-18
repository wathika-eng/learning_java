import java.util.ArrayList;

public class Inventory {
    // store a group of objects, dynamic
    private ArrayList<Item> items;

    // constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // add
    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}

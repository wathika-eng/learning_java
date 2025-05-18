public class Item {
    // cannot be directly accessed from another class
    private String name;
    private int quantity;

    // constructor to create a class
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // encaspulate getter and setter
    public String getName() {
        if (name == "") {
            return "error";
        }
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // change how toString returns
    @Override
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity;
    }
}

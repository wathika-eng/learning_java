public class Main {
    public static void main(String[] args) {
        // new inventory object
        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples", 20);
        Item item2 = new Item("Banana", 10);

        Fruit fruit1 = new Fruit("vitamin", "Watermelon", 10);

        Weapon weapon = new Weapon("Sword", 2, 45, "Waepon");

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(fruit1);
        inventory.addItem(weapon);

        inventory.display();
    }
}

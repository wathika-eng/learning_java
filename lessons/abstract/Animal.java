interface Animal {
    void makeNoise();

    default void fuelType() {
        System.out.println("Petrol");
    }

    static void maintenance() {
        System.out.println("Check every 6 months");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bosco", 10);
        // myDog.name = "Kamaa";
        Puppy puppy = new Puppy("Female", "John", 1);
        System.out.println(myDog.display());
        System.out.println(puppy.display());
    }
}

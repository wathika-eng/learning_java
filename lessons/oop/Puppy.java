// inheritance - inherits all attributes and methods
// subclass
public class Puppy extends Dog {
    private String gender;

    // pass in attributes which you are inheriting
    public Puppy(String gender, String name, int age) {
        // super acts as a constructor
        super(name, age);
        this.gender = gender;
    }

    // override changes how an inherited method works
    // must have same return type, params and method name, public
    // this accesses private fields in parent class
    @Override
    public String display() {
        return "Puppy name: " + this.getName() + " Age: " + this.getAge();
    }
}

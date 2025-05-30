public class Dog {
    // encapsulation
    private String name;
    private int age;

    // constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // pverloading
    public String getName(String nickName) {
        return name + nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String display() {
        return "Dog name: " + name + " Age: " + age;
    }
}

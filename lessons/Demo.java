// class name must match file
// javac Demo.java then java Demo
class Demo {
    public static void main(String[] args) {
        // strongly typed - must declare variable type before
        int num = 10;
        double num2 = 9.2;
        String name = "Jowie";
        int bigNum = 100_000;
        // default null
        String empty;
        int[] sizes = { 4, 18, 2, 20 };
        for (int size : sizes) {
            if (size > 16) {
                break;
            }
            // prints 4
            System.out.println("size is " + size);
        }
        String s = name.toUpperCase();
        System.out.println(s);
    }
}

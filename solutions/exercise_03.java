// print numbers less than 5 in an array
public class exercise_03 {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        for (int i : a) {
            if (i < 5) {
                System.out.println(i);
            }
        }
    }
}

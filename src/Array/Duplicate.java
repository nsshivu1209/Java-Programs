package Array;

public class Duplicate {
    public static void main(String[] args) {
        String s = "test yantra";
        char[] a = s.toCharArray();
        String s1 = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[i + 1]) {
                s1 = s1 + a[i];
                System.out.print(s1);
            }

        }

    }
}

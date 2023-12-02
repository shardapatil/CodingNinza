public class Solution {
    static int goodSpell(int n, String s) {
        int prod1 = 1, prod2 = 1;

        if (n % 2 != 0) {
            return 0; // If the length is odd, return 0 (as specified in the original code)
        }

        for (int i = 0; i < n / 2; i++) {
            prod1 *= Character.getNumericValue(s.charAt(i)); // Extract numeric value of character
        }

        for (int i = n / 2; i < n; i++) {
            prod2 *= Character.getNumericValue(s.charAt(i)); // Extract numeric value of character
        }

        if (prod1 == prod2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = goodSpell(5, "12356");
        System.out.println(result);
    }
}

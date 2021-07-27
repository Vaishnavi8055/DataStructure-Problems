package Miscellaneous;/*
 * Created by Vaishnavi  Chaurasia
 * 27-Jul-21
 * 8:51 PM
 */

// Print a Pattern
//         s
//         se
//         sen
//         send
//         sendi
//         sendin
//         sending
//         ending
//         nding
//         ding
//         ing
//         ng
//         g

public class P_1 {
    public static void main(String[] args) {

        String s = "sending";

        // Upper Part
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= s.length() - i + 1; j++) {
                // space
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                // sending string
                System.out.printf("%c", s.charAt(j));

            }
            System.out.println();
        }

        // Down part
        for (int i = 1; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // character from e
                System.out.printf("%c", s.charAt(j));
            }
            for (int j = 0; j < i; j++) {
                // space
                System.out.printf(" ");
            }
            System.out.println();
        }

    }
}

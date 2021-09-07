package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 9:14 PM
 * DataStructure-Problems
 */

public class Problem_16 {

    public static void main(String[] args) {

        System.out.println(removeX("zxaxbc"));
    }

    public static String removeX(String s){

        if(s.length() == 0)
            return s;

        String ans = "";

        if(s.charAt(0) != 'x')
            ans += s.charAt(0);

        String smallAns = removeX(s.substring(1));

        return ans+smallAns;
    }

}

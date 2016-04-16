package DataStructures.ArraysStrings;

import java.util.Scanner;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class StringCheckIFRotation {

    public static boolean isRotation(String s1, String s2) {
        return (s1 + s1).contains(s2.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(isRotation(s1,s2));
    }
}

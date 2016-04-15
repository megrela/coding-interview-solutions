package data_structures.arrays_strings;

import java.util.Scanner;

/**
 * Created by gime on 4/15/2016.
 */
public class StringAnagrams {

    public static boolean areAnagrams(char[] s1, char[] s2) {
        int[] have = new int[256];
        int diff = 0, i;

        if (s1.length != s2.length) return false;

        for (i=0; i<256; i++)
            have[i] = 0;

        for (i=0; i < s1.length; i++) {
            if (have[s1[i]] == 0) diff ++;
            have[s1[i]]++;
        }

        for (i=0; i < s2.length; i++) {
            if (have[s2[i]] == 0) return false;
            have[s2[i]]--;
            if (have[s2[i]] == 0) diff--;
        }
        return diff == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(areAnagrams(s1.toCharArray(), s2.toCharArray()));
    }
}

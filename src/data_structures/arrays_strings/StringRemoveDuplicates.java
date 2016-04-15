package data_structures.arrays_strings;

import java.util.Scanner;

/**
 * Created by gime on 4/15/2016.
 */
public class StringRemoveDuplicates {
    /**
     * remove duplicates from string without any extra memory
     * @param str
     */
    public static void removeDuplicates(char[] str) {
        if (str == null) return;
        int n = str.length;
        if (n < 2) return;

        int tail = 0;

        for (int i=0; i<n; i++) {
            int j;
            for (j=0; j<tail; j++) {
                if (str[i] == str[j])
                    break;
            }
            if (j == tail) {
                str[tail++] = str[i];
            }
        }
        str[tail] = 0;
    }

    public static void removeDuplicatesFixedSize(char[] str) {
        if (str == null) return;
        int n = str.length;
        if (n < 2) return;
        boolean[] have = new boolean[256];
        for (int i=0; i<256; i++) {
            have[i] = false;
        }
        int tail = 0;
        for(int i=0; i<n; i++) {
            if (!have[str[i]]) {
                str[tail ++] = str[i];
                have[str[i]] = true;
            }
        }
        str[tail] = 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        char[] str = word.toCharArray();
        removeDuplicates(str);
        System.out.println(str);

        str = word.toCharArray();
        removeDuplicatesFixedSize(str);
        System.out.println(str);
    }
}

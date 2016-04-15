package data_structures.arrays_strings;

import java.util.Scanner;

/**
 * Created by Giorgi Megreli on 4/15/2016.
 */
public class StringInPlaceReverse {
    public static String reverse(String word) {
        int i=0, j=word.length()-1;
        char[] wordAr = word.toCharArray();
        char tmp;
        while(i < j) {
            tmp = wordAr[i];
            wordAr[i] = wordAr[j];
            wordAr[j] = tmp;
            i++; j--;
        }
        return new String(wordAr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(reverse(word));
    }
}

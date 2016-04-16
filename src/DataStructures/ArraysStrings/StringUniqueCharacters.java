package DataStructures.ArraysStrings;

import CommonT.BitMask;

import java.util.Arrays;
import java.util.Scanner;

public class StringUniqueCharacters {
    private static boolean byBitMask(String word) {
        BitMask mask = new BitMask();
        for (int i=0; i<word.length(); i++) {
            int bit = word.charAt(i) - 'a';
            if (mask.checkBit(bit) == 1) return false;
            mask.on(bit);
        }
        return true;
    }

    private static boolean byFixedSizedArray(String word) {
        boolean[] have = new boolean[256];
        for (int i=0; i<word.length(); i++) {
            if (have[word.charAt(i)])
                return false;
            have[word.charAt(i)] = true;
        }
        return true;
    }

    private static boolean bySorting(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        word = new String(chars);
        for (int i=0; i+1 < word.length(); i++)
            if (word.charAt(i) == word.charAt(i+1))
                return false;
        return true;
    }

    public static void hasUniqueCharacters(String word) {
        System.out.println(byBitMask(word));
        System.out.println(byFixedSizedArray(word));
        System.out.println(bySorting(word));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        hasUniqueCharacters(word);
    }
}

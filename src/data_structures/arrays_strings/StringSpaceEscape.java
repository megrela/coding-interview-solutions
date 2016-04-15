package data_structures.arrays_strings;

import java.util.Scanner;

/**
 * Created by gime on 4/15/2016.
 */
public class StringSpaceEscape {
    public static char[] escape(char[] str, char what, char[] with) {
        int n = str.length;
        int m = with.length;
        int tail = n, i;

        for (i=0; i<n; i++)
            if (str[i] == what)
                tail += m - 1;

        char[] ret = new char[tail];

        for (i=n-1; i >= 0; i--)
            if (str[i] != what)
                ret[--tail] = str[i];
            else
                for (int j = m-1; j>=0; j--)
                    ret[--tail] = with[j];
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(escape(word.toCharArray(), ' ', "%20".toCharArray()));
    }
}

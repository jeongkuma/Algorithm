package util;

import java.util.Locale;

public class CompareString {

    public static void main(String[] args) {
        compare("VTS", "VTS", true, true);
    }

    public static boolean compare(String left, String right, boolean caseSensitive, boolean equals) {
        int iRv = 0;
        boolean bRv = true;

        if (right != null) {
            if (left != null) {
                if (caseSensitive) {
                    iRv = right.compareTo(left);
                } else {
                    iRv = right.compareTo(left.toLowerCase());
                }
            }
        }

        if (equals) {
            if (iRv < 0) {
                bRv = false;
            }
        } else {
            if (iRv <= 0) {
                bRv = false;
            }
        }
        return bRv;

    }
}

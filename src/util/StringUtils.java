package util;

public class StringUtils {
    public static void main(String[] args) {

    }

    public static String null2EmptyString(String target) {
        return target != null ? target : "";
    }


    public static String rTrim(String target) {
        return null2EmptyString(target).replaceAll("\\s+$", "");
    }

    public static String lTrim(String target) {
        return null2EmptyString(target).replaceAll("^\\s+", "");
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

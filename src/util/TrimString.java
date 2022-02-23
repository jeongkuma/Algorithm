package util;

public class TrimString {

    public static void main(String[] args) {
//        System.out.print(rTrim("qrwer    "));

        System.out.print("TASK");
        System.out.print(lTrim("    qrwer"));

//        System.out.print(lTrim("qrwer    "));

        System.out.print("TASK");
    }

    public static String rTrim(String target) {
        return target != null ? target.replaceAll("\\s+$", "") : "";
    }

    public static String lTrim(String target) {
        return target != null ? target.replaceAll("^\\s+", "") : "";
    }
}

public class SubString {
    public static void main(String args[]) {
        String str = "Hello World";
        // System.out.println(subString(str, 0, 5));
        System.out.print(str.substring(0, 5));
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}

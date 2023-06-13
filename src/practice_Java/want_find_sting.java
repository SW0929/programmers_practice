package practice_Java;

public class want_find_sting {
    public static void main(String[] args) {
        System.out.println(wantFindStringSolution("AbCdEfG", "aBc"));
    }
    public static int wantFindStringSolution(String myString, String pat) {

        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}

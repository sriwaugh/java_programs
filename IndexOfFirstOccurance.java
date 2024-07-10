package java_program;

public class IndexOfFirstOccurance {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String s="hakssad";
        String a="sad";
        System.out.println(strStr(s,a));
    }
}

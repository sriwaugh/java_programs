package java_program;public class Subsequence_of_the_string {
    public static void main(String[] args) {
        String a="abc";
        String b="afbgco";
        int count=0;
        char str[]=a.toCharArray();
        char str1[]=b.toCharArray();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str1.length; j++) {
                if(str[i]==str[j])
                {
                    if(i!=j)
                    {
                        count++;
                    }
                }
            }
        }
    }
}

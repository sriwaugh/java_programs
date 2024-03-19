package java_program;
import java.util.Arrays;
public class length_of_the_sentence {
    public static void main(String[] args) {
            String sen="The sky is blues";
            System.out.println(Arrays.toString(sen.split(" ")));
            String[] sent=sen.split(" ");
            System.out.println(sent[3].length());
            String sente=sent[3];
            System.out.println(sente);
            System.out.println(sente.charAt(1));

        }
    }


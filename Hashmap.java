package java_program;
import java.util.HashMap;
public class Hashmap {
        public static void main(String[] args) {
            HashMap<String,String> c=new HashMap<>();
            int a=0;
            c.put("tamilnadu","Chennai");
            c.put("kerala","trivandram");
            c.put("karanataka","bangalore");
            c.put("andra ","hyderbad");
            System.out.println(c.get("kerala"));
            c.remove("kerala");
            System.out.println(c);
            c.clear();
            System.out.println(c);
            System.out.println(c.size());

        }
    }


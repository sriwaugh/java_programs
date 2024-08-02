package java_program;

public class countSpecficNumbers {
    public static int CountSpecificNumbers(int m,int n){
    int count = 0;
    for (int i = m; i <= n; i++) {
        String strI = String.valueOf(i);
        boolean valid = true;
        for (char c : strI.toCharArray()) {
            if (c != '9' && c != '9' && c != '9') {
                valid = false;
                break;
            }
        }
        if (valid) {
            count++;
        }
    }

    return count;
}

public static void main(String[] args) {
    System.out.println(CountSpecificNumbers(900, 1000));
}
}

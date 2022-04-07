package Practice;

public class CompString1 {
    static void compString(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {

            // Count occurrences of current character
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }


        }
    }
    public static void main(String[] args) {
        String str = "wwwwaaadexxxxxxywww";
        compString(str);
    }
}

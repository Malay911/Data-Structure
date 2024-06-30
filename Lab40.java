// Write a program to determine if an input character string is of the form aibi where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.
public class Lab40 {
    public static void main(String[] args) {
        String str = "ababababababababababababababab";
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            } else if (str.charAt(i) == 'b') {
                countB++;
            }
        }
        if (countA == countB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
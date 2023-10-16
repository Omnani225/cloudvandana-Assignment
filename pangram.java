package Java;

public class pangram {
    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog"; 

        if (isPangram(inputSentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase(); 
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return false; // If any letter is missing, it's not a pangram
            }
        }
        return true; // All letters are present, it's a pangram
    }
}
package Java;

import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {
        String romanNumeral = "X";
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        // Create a mapping of Roman numeral characters to their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int charValue = romanMap.get(s.charAt(i));
            if (charValue < prevValue) {
                result -= charValue;
            } else {
                result += charValue;
            }
            prevValue = charValue;
        }

        return result;
    }
}

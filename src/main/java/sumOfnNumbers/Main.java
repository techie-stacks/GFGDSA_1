package sumOfnNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1 = "This is done done Done By by me Me Me me";
        System.out.println("Most repated word  : " + mostFrequentWord(s1));
    }

    private static List<String> mostFrequentWord(String words) {
        List<String> s = new ArrayList<>();
        if (words == null || words.isEmpty() || words.isBlank() || words.matches("^\\s*$")) {
            System.out.println("-1");
        }
        assert words != null;
        if (!words.isEmpty()) {
            String[] splited = words.split(" ");
            Arrays.sort(splited);
            int max = 0;
            int count = 1;
            String word = splited[0];
            String curr = splited[0];
            for (int i = 1; i < splited.length; i++) {
                if (splited[i].equals(curr)) {
                    count++;
                }
                else {
                    count = 1;
                    curr = splited[i];
                }
                if (max < count) {
                    max = count;
                    word = splited[i];
                }
            }
            s.add(getReverse(word));
        }
        return s;
    }

    private static String getReverse(String str) {
        String reverseString = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            reverseString = ch + reverseString; //adds each character in front of the existing string
        }
        return reverseString;
    }

}

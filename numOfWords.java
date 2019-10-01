import java.util.Scanner;

public class numOfWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hey! Type a sentence and I'll count the number of words: ");

        String sentence = in.nextLine();
        // Gee, I sure hope people understand what I mean by the below variable...
        int variableName = countVowels(sentence);
        
        System.out.println("There are " + variableName + " vowels in that sentence.");
        in.close();
    }

    private static int countVowels(String str) {
        int vowelCount = 0;

        // There has to be a better way to loop through this string...
        for (int index = 0; index < str.length(); index++) {
            char curr = str.charAt(index);
            if (isVowel(curr)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    private static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'y':
                return true;
        }
        // Wait, are we gonna catch every vowel? Seems sus to me...

        return false;
    }
}
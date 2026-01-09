package stack;

import java.util.LinkedList;
import java.util.List;

public class ExercicioStack {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> characterList = new LinkedList<>();
        LinkedList<Character> reversedCharacterList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                characterList.push(Character.toLowerCase(string.charAt(i)));
            }
        }
        for (Character character: characterList){
            reversedCharacterList.push(character);
        }
        return characterList.equals(reversedCharacterList);
    }
}

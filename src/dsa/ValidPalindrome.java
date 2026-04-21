package dsa;

public class ValidPalindrome {

    void main() {
        String test1 = "Was it a car or a cat I saw?"; // true
        String test2 = "tab a cat"; // false

        IO.println(isPalindrome(test1));
        IO.println(isPalindrome(test2));
    }

    boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0, j = cleaned.length() - 1; i < cleaned.length(); i++, j--) {
            if(cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/valid-palindrome/
         */

        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";

        System.out.println(isValidPalindrome(input1));
        System.out.println(isValidPalindrome(input2));
        System.out.println(isValidPalindrome(input3));
    }

    public static boolean isValidPalindrome(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int leftIndex = 0;
        int rightIndex = input.length() - 1;
        while (leftIndex <= rightIndex) {
            if (input.charAt(leftIndex) != input.charAt(rightIndex)) return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}

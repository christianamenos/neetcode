import java.util.Arrays;

class ValidAnagram {
    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/valid-anagram/
         *
         * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
         *
         * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
         *
         * Example 1:
         *   Input: s = "anagram", t = "nagaram"
         *   Output: true
         *
         * Example 2:
         *   Input: s = "rat", t = "car"
         *   Output: false
         *
         * Constraints:
         *   1 <= s.length, t.length <= 5 * 104
         *   s and t consist of lowercase English letters.
         *
         */

        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] charsInS = s.toCharArray();
        char[] charsInT = t.toCharArray();
        Arrays.sort(charsInS);
        Arrays.sort(charsInT);
        return Arrays.equals(charsInS, charsInT);
    }
}
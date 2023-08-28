import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/group-anagrams/
         */

        String[] input1 = new String[]{"eat","tea","tan","ate","nat","bat"};
        String[] input2 = new String[]{""};
        String[] input3 = new String[]{"a"};

        System.out.println(groupAnagrams(input1).toString());
        System.out.println(groupAnagrams(input2).toString());
        System.out.println(groupAnagrams(input3).toString());
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for (String anagram : strs) {
            String anagramIndex = buildAnagramIndex(anagram);
            if (!groups.containsKey(anagramIndex)) {
                ArrayList<String> group = new ArrayList<>();
                group.add(anagram);
                groups.put(anagramIndex, group);
            } else {
                List<String> group = groups.get(anagramIndex);
                group.add(anagram);
                groups.put(anagramIndex, group);
            }
        }
        return groups.values().stream().toList();
    }

    public static String buildAnagramIndex(String s) {
        char[] aux = s.toCharArray();
        Arrays.sort(aux);
        return Arrays.toString(aux);
    }
}

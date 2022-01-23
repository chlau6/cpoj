import java.util.*;

class Playground {
    public static void main(String[] args) {
        Integer a = 1;

        System.out.println(null == null);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();

            Arrays.sort(chars);
            String s = String.valueOf(chars);

            map.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
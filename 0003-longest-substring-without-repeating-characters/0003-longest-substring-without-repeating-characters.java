class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i = 0, j = 0;
        int ms = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length() && i<s.length()) {
            char ch = s.charAt(j);
            if (!set.contains(ch)) {
                set.add(ch);
                j++;
            } else {
                int cs = j - i;
                ms = Math.max(ms, cs);
                while (s.charAt(i) != s.charAt(j)) {
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int cs = j - i;
        ms = Math.max(ms, cs);
        return ms;
    }
}
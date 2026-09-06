class Solution {
    public boolean isAnagram(String s1, String s2) {
        // if(s.length() != t.length()) return false;
        // else
        // {
        //     char ch1[] =s.toCharArray();
        //     char ch2[] =t.toCharArray();
        //     Arrays.sort(ch1);
        //     Arrays.sort(ch2);
        //     if(Arrays.equals(ch1,ch2)){
        //         return true;
        //     }
        // }
        // return false;

        if(s1.length()!=s2.length()) return false;
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            mapA.put(ch, mapA.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            mapB.put(ch, mapB.getOrDefault(ch, 0) + 1);
        }
        for(char ch : mapA.keySet()){
            if(!mapB.containsKey(ch) || !mapA.get(ch).equals(mapB.get(ch))) return false;
        }
        return true;
    }
}
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

       HashMap<Character,Integer> map = new HashMap<>();
        if(s1.length()!=s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);  
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0) return false;
            map.put(ch, map.get(ch)-1);
        }
        return true;
    }
}
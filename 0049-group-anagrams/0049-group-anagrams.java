class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String, List<String>> map = new HashMap<>();
        // for(String str:strs){
        //     char[] arr = str.toCharArray();
        //     Arrays.sort(arr);
        //     String key = new String(arr);
        //     map.putIfAbsent(key,new ArrayList<>());
        //     map.get(key).add(str);
        // }
        // return new ArrayList<>(map.values());
        Map<String,List>map = new HashMap<>();
        for(String s:strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
      if(sentence.length()<26) return false;
      int arr[] = new int[26];
      for(int i=0; i<sentence.length(); i++){
        char ch = sentence.charAt(i);
        arr[ch-'a']++;
      } 
      for(int x:arr){
        if(x==0) return false;
      }
      return true;
    }
}
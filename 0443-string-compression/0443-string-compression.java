class Solution {
    public int compress(char[] chars) {
        int n =chars.length;
        int i=0,j=0;
        int len=0;
        StringBuilder ans = new StringBuilder();
        while(j<n){
            if(chars[i]==chars[j]) j++;
            else{
                len =j-i;
                if(len<2){
                    ans.append(chars[i]);
                    len=0;
                    i=j;
                }
                else{
                    ans.append(chars[i]);
                    ans.append(len);
                    len=0;
                    i=j;
                }
            }
        }
        len =j-i;
        if(len<2){
            ans.append(chars[i]);
            len=0;
            i=j;
        }
        else{
            ans.append(chars[i]);
            ans.append(len);
            len=0;
            i=j;
        }
        for (int k = 0; k < ans.length(); k++) {
            chars[k] = ans.charAt(k);
        }
        return ans.length();
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int left =0;
        int result =0;

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            while(chars.contains(ch)){
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(ch);
            result = Math.max(result, i-left+1);
        }
        

        return result;
    }
}

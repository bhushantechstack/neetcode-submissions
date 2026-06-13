class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();
        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(t1);
        int sum=0;
        for(int i =0;i<s1.length;i++)
        {
            if(s1[i]==t1[i])
            System.out.println("match");
            else sum++;
        }
        if (sum>0)
        return false;
        else return true;
    }
}

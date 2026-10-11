class Solution {
    public boolean isValid(String s) {
        // 1. Initialize the stack so it doesn't crash at runtime
        Stack<Character> st = new Stack<>(); 

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(st.size() == 0) {
                    return false;
                }
                
                if((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        // 2. Fixes the "missing return statement" compilation error
        return st.isEmpty(); 
    }
}

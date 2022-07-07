//code
class Solution {
    public boolean isValid(String s) {
        //1. String traversal
        // 1.1 opening -> push
        // 1.2 closing
        // 1.2.1 if stack is empty?
        // 1.2.2 is peek my complemetary opposite
        // 1.2.3 if everything okay -> pop
        // if(s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i ++) {
            char brac = s.charAt(i);
            if(brac == '(' || brac == '{' || brac == '[') {
                st.push(brac);
            } else {
                if (st.isEmpty()) return false;
                if(brac == ')' && st.peek() != '(') return false;
                if(brac == ']' && st.peek() != '[') return false;
                if(brac == '}' && st.peek() != '{') return false;
                st.pop();
            }
        }
       return st.isEmpty();
    }
}
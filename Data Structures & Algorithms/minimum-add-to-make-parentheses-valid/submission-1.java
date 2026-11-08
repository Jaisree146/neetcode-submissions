class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                if(st.isEmpty()) count++;
                else{
                    char poped=st.pop();
                }
            }
        }
        return count+st.size();
    }
}

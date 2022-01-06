class Solution {
    public boolean isValid(String s) {
        int size = s.length();

        Stack<Character> st = new Stack<>();
        if(size%2!=0){
            return false;
        }
        int i=0;
        while(i<size){
            char check = s.charAt(i);
            if(check =='(' || check =='[' || check=='{'){
                st.push(check);
            }
            else if(check ==')'  && !st.empty() && '(' ==st.peek()){
                st.pop();
            }
            else if(check ==']'  && !st.empty() && '[' ==st.peek()){
                st.pop();
            }
            else if(check =='}'  && !st.empty() && '{' ==st.peek()){
                st.pop();
            }
            else{
                return false;
            }

            i++;
        }

        if(!st.empty()){
            return false;
        }
        return true;
    }
}
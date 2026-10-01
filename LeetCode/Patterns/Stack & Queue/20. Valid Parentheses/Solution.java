class Solution {
    public boolean isValid(String s) {
       HashMap<Character,Character> hm=new HashMap<>();
       hm.put(')','(');
       hm.put(']','[');
       hm.put('}','{');
       Stack <Character> st=new Stack<>();
       for(char c:s.toCharArray()){
        if(hm.containsValue(c)) st.push(c);
        else if(hm.containsKey(c)){
            if(st.isEmpty()||hm.get(c)!=st.pop()){
                return false;
            }
        }
       }
       return st.isEmpty();
    }
}
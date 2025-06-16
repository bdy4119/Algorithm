class Solution {
    public String solution(String code) {
        boolean mode = false;
        StringBuilder ret = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++) {
            char str = code.charAt(i);
            
            if(str == '1') mode = !mode;
            else ret.append((i % 2 != 0 && mode) || (i % 2 == 0 && !mode) ? str : "");
        }
        
        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
}
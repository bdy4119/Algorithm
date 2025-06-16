class Solution {
    public String solution(String code) {
        String mode = "0";
        StringBuilder ret = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++) {
            String str = code.charAt(i) + "";
        
            if(mode.equals("0")) {
                if(str.equals("1")) mode = "1";
                else ret.append(i % 2 == 0 ? str : "");
            }
            else {
                if(str.equals("1")) mode = "0";
                else ret.append(i % 2 != 0 ? str : "");
            }
        }
        
        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
}
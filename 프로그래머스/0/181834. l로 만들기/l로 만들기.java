class Solution {
    public String solution(String myString) {
        String answer = "";
        
        int charINum = (int) 'l';
        for(int i = 0; i < myString.length(); i++) {
            if( (int) myString.charAt(i) < charINum ) answer += "l";
            else answer += myString.charAt(i) + "";
        }
        
        return answer;
    }
}
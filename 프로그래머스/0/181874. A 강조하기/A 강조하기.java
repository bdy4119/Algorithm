class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            String charStr = myString.charAt(i) + "";
            
            if(charStr.equalsIgnoreCase("A")) answer += "A";
            else answer += charStr.toLowerCase();
        }
        
        return answer;
    }
}
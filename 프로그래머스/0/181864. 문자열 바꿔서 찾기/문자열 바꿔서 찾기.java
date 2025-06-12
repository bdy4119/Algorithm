class Solution {
    public int solution(String myString, String pat) {
        String result = "";
        
        for(int i = 0; i < myString.length(); i ++) 
            result += myString.charAt(i) == 'A' ? "B" : "A";
        
        return result.contains(pat) ? 1 : 0;
    }
}
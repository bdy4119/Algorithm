class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String upperMyString = myString.toUpperCase();
        String upperPat = pat.toUpperCase();
        
        if(upperMyString.contains(upperPat)) answer = 1;
        
        return answer;
    }
}
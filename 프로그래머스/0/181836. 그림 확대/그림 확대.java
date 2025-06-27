class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int answerIdx = 0;
        for(String str : picture) {
            StringBuilder result = new StringBuilder();
            
            for(int i = 0; i < str.length(); i++) 
                result.append(str.substring(i, i + 1).repeat(k));
            
            for(int j = 0; j < k; j++) answer[answerIdx++] = result.toString();
        }
        
        return answer;
    }
}
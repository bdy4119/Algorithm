class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int answerIdx = 0;
        for(String str : picture) {
            String result = "";
            
            for(int i = 0; i < str.length(); i++) {
                for(int j = 0; j < k; j++) {
                    result += str.substring(i, i + 1);
                }
            }
            for(int j = 0; j < k; j++) {
                answer[answerIdx++] = result;
            }
        }
        
        return answer;
    }
}
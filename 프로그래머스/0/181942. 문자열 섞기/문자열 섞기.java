class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int cnt = 0;
        while(cnt < str1.length()) {
            answer += str1.substring(cnt, cnt + 1) + str2.substring(cnt, cnt + 1);
            cnt++;
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] strArr = new String[my_string.length() / m + my_string.length() % m];
        
        int idx = 0;
        for(int i = 0; i < my_string.length(); i += m) {
            strArr[idx++] = my_string.substring(i, i + m);
        }
        
        for(String str : strArr) {
            answer += str.substring(c-1, c);
        }
        
        return answer;
    }
}
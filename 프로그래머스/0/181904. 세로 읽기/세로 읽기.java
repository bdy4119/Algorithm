class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] strArr = new String[my_string.length() / m + my_string.length() % m];
        
        for(int i = 0; i < my_string.length(); i += m) {
            String str = my_string.substring(i, i + m);
            answer += str.substring(c - 1, c);
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] strArr = new String[my_string.length() / m + my_string.length() % m];
        
        for(int i = 0; i < my_string.length(); i += m) {
//            String str = my_string.substring(i, i + m);
            answer += my_string.substring(i + c - 1, i + c);
        }
        
        return answer;
    }
}
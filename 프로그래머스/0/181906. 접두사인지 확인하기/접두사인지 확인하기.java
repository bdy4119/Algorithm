class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        // 접두사 배열
        String[] strArr = new String[my_string.length()];
        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = my_string.substring(0, i+1);
        }
        
        for(String str : strArr) {
            if(str.equals(is_prefix)) answer++;
        }
        
        return answer;
    }
}
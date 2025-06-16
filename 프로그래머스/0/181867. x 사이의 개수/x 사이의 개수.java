class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x", -1);
        
        int[] answer = new int[strArr.length];
        
        int idx = 0;
        for(String str : strArr) answer[idx++] = str.length();
        
        return answer;
    }
}
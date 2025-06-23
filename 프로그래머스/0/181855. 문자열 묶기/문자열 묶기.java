class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int maxLength = 0;
        for(String str : strArr) {
            if(str.length() > maxLength) maxLength = str.length();
        }
        
        int[] maxArr = new int[maxLength];
        for(int i = 0; i < strArr.length; i++) {
            maxArr[strArr[i].length() - 1] += 1; 
        }
        
        for(int max : maxArr) {
            if(answer < max) answer = max;
        }
        
        return answer;
    }
}
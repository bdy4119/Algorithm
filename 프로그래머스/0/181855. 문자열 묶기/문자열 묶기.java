class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] maxArr = new int[30];
        for(int i = 0; i < strArr.length; i++) maxArr[strArr[i].length() - 1] += 1; 
        
        for(int max : maxArr) if(max > 0 && answer < max) answer = max;
        
        return answer;
    }
}
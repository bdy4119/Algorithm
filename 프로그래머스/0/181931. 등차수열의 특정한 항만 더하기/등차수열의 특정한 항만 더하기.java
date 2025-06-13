class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int num = 0;
        for(boolean b : included) {
            num += (num == 0 ? a : d);
            answer += (b ? num : 0);
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean b = false;
        
        for(int i : num_list) {
            if(i < 0) return answer;
            
            answer++;
        }
        
        return !b ? -1 : answer;
    }
}
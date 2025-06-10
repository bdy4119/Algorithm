class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sumMultiple = 0;
        int multiple = 1;
        for(int n : num_list) {
            sumMultiple += n;
            multiple *= n;
        }
        
        if(multiple < sumMultiple*sumMultiple) answer = 1;
        else answer = 0;
        
        return answer;
    }
}
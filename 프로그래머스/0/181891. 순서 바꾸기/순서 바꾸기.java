class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int cnt = 0;
        // n번째 이후의 원소들
        for(int i = n; i < num_list.length; i++) {
            answer[cnt++] = num_list[i];
        }
        
        // n번째를 포함한 이전의 원소들
        for(int i = 0; i < n; i++) {
            answer[cnt++] = num_list[i];
        }
        
        return answer;
    }
}
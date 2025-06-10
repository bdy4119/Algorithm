class Solution {
    public int[] solution(int[] num_list, int n) {
        int arrCnt = (num_list.length - 1)/n + 1;
        int[] answer = new int[arrCnt];
        
        int cnt = 0;
        for(int i = 0; i < num_list.length; i+=n) {
            answer[cnt++] = num_list[i];
        }
        return answer;
    }
}
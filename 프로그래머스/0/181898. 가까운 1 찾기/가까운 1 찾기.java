class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        int arrIdx = 0;
        for(int i : arr) {
            if(arrIdx > (idx - 1) && i == 1) {
                answer = arrIdx;
                break;
            }
            arrIdx++;
        }
        
        if(arrIdx == arr.length) answer = -1;
        
        return answer;
    }
}
class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
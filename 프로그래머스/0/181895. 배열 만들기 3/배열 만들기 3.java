class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int startNum = intervals[0][0];
        int endNum = intervals[0][1];
        
        int startNum2 = intervals[1][0];
        int endNum2 = intervals[1][1];
        
        int arrNum = (endNum - startNum + 1) + (endNum2 - startNum2 + 1);
        int[] answer = new int[arrNum];
        
        int idx = 0;
        while(startNum <= endNum) answer[idx++] = arr[startNum++];
        
        while(startNum2 <= endNum2) answer[idx++] = arr[startNum2++];
        
        return answer;
    }
}
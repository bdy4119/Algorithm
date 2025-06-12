import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int lastNum = num_list[num_list.length - 1];        // 마지막 원소
        int secondLastNum = num_list[num_list.length -2];    // 그 이전 원소
        
        int idx = 0;
        for(int i : num_list) {
            answer[idx++] = i;
        }
        
        answer[num_list.length] = lastNum > secondLastNum
                                    ? lastNum - secondLastNum : lastNum * 2;
        
        return answer;
    }
}
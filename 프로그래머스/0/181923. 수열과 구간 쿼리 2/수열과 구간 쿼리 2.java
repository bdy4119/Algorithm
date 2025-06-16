import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        
        for(int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            
            int num = Integer.MAX_VALUE;
            boolean b = false;
            
            for(int i = s; i <= e; i++) {
                if(arr[i] > k && arr[i] < num) {
                    num = arr[i];
                    b = true;
                }
            }
            
            answer.add(b ? num : -1);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int idx = 0;
            if(flag[i]) {
                while(idx < arr[i]*2) {
                    answer.add(arr[i]);
                    idx++;
                }
            }
            else {
                int size = answer.size();
                
                idx = answer.size();
                while(idx != size - arr[i]) {
                    answer.remove(idx - 1);
                    idx--;
                }
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
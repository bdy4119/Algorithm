import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr)
                     .filter(num 
                             -> !duplCheck(num, delete_list))
                     .toArray();
    }

    public Boolean duplCheck(int num, int[] delete_list) {
        for(int delete : delete_list) {
            if(num == delete) return true;
        }
        
        return false;
    }
}
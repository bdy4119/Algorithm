import java.util.Arrays;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
            int n = i;
            while(n != 0) {
                list.add(i);
                n--;
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
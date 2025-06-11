import java.util.*;

class Solution {
    public int[] solution(int n) {
        int num = n;
        
        // 수열 리스트
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(num != 1) {
            if(num % 2 == 0) num /= 2;
            else num = 3 * num + 1;
            
            list.add(num);
        }
        
        // List<Integer> -> int[] 로 변환
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        
        // Set은 중복제거해줌
        // result의 size 에 따라 결과값 구별
        // size == 3 > 다 다름 / size == 2 > 두개는 같음 / size == 1 > 모두 같은 수
        Set<Integer> result = Stream.of(a, b, c).collect(Collectors.toSet());
        
        for(int i = 1; i <= 4 - result.size(); i++) 
            answer *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        
        return answer;
    }
}
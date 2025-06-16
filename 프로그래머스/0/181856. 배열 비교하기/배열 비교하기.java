import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);
        
        // 두 배열의 길이가 같을때
        if(answer == 0){
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();
            
            answer = Integer.compare(arr1Sum, arr2Sum);
        };
        
        return answer;
    }
}
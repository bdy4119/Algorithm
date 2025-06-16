import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length < arr2.length) return -1;
        else {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();
            
            if(arr1Sum > arr2Sum) return 1;
            else if(arr1Sum < arr2Sum) return -1;
        };
        
        return answer;
    }
}
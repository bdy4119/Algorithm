import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                     .map(n -> (k % 2 == 1) ? n * k : n + k)
                     .toArray();
    }
}
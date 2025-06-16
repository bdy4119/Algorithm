class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
                
            for(int i = 0; i < arr.length; i++) if(s <= i && i <= e) arr[i] += 1;
        }
        
        return arr;
    }
}
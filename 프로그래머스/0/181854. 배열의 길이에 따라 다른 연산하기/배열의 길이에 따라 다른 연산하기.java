class Solution {
    public int[] solution(int[] arr, int n) {
        boolean b = arr.length % 2 == 0 ? true : false;
        
        for(int i = 0; i < arr.length; i++) {
            if(!b) {
                if(i % 2 == 0) arr[i] += n;
            }
            else {
                if(i % 2 != 0) arr[i] += n;
            }
        }
        
        return arr;
    }
}
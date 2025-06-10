class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        int cnt = 0;
        for(int n : arr) {
            if(n >= 50 && n % 2 == 0) answer[cnt] = n / 2;
            else if(n < 50 && n % 2 == 1) answer[cnt] = n * 2;
            else answer[cnt] = n;
            
            cnt++;
        }
        
        return answer;
    }
}
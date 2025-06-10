class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int iNum = (n % 2 == 1) ? 1 : 2;
        for(int i = iNum; i <= n; i += 2) {
            if(iNum == 1) answer += i;
            else answer += i*i;
        }
        
        return answer;
    }
}
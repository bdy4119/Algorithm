class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int n1 = Integer.parseInt(a + "" + b);
        int n2 = 2*a*b;
        
        if(n1 > n2) answer = n1;
        else if(n1 < n2) answer = n2;
        else if(n1 == n2) answer = a + b;
        
        return answer;
    }
}
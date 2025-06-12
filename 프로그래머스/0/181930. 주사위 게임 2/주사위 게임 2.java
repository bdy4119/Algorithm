class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int sum = a + b + c;    // 합
        int squareSum = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));   // 제곱의 합
        int cubeSum = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));     // 세제곱의 합
        
        if(a != b && a != c && b != c) answer = sum;
        else if( (a == b && a != c) 
                    || (b == c && b != a)
                    || (a == c && a != b)) answer = sum * squareSum;
        else if(a == b && a == c) answer = sum * squareSum * cubeSum;
        
        return answer;
    }
}
class Solution {
    public int solution(int n, String control) {
        
        String[] controlArr = control.split("");
        
        int answer = n;
        for(String str : controlArr) {
            if(str.equals("w")) answer++;
            else if(str.equals("s")) answer--;
            else if(str.equals("d")) answer += 10;
            else if(str.equals("a")) answer -= 10;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] str = num_str.split("");
        
        for(String s : str) answer += Integer.parseInt(s);
        
        return answer;
    }
}
class Solution {
    public String solution(int[] numLog) {
        
        // 조작 전, 처음에 주어지는 숫자
        int num = numLog[0];
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++) {
            if(num + 1 == numLog[i]) answer += "w";
            else if(num - 1 == numLog[i]) answer += "s";
            else if(num + 10 == numLog[i]) answer += "d";
            else if(num - 10 == numLog[i]) answer += "a";
            
            num = numLog[i];
        }
        
        return answer;
    }
}
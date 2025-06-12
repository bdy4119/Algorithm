class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        
        switch(strArr[1]) {
            case "+" : 
                answer = Integer.valueOf(strArr[0]) + Integer.valueOf(strArr[2]);
                break;
            case "-" : 
                answer = Integer.valueOf(strArr[0]) - Integer.valueOf(strArr[2]);
                break;
            case "*" : 
                answer = Integer.valueOf(strArr[0]) * Integer.valueOf(strArr[2]);
                break;
        }
        
        return answer;
    }
}
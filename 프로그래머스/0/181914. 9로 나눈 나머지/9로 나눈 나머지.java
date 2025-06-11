class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] strNum = number.split("");
        int sum = 0;
        
        for(String i : strNum) {
            sum += Integer.parseInt(i);    
        }
        
        answer = sum % 9;
        
        return answer;
    }
}
class Solution {
    public String solution(String[] arr) {
        StringBuilder strBuilder = new StringBuilder();
        for(String str : arr) strBuilder.append(str);
        
        String answer = strBuilder.toString();
        return answer;
    }
}
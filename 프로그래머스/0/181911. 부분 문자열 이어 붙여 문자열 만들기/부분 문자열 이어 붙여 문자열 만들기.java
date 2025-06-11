class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        int partsIdx = 0;
        for(String str : my_strings) {
            answer += getString(parts[partsIdx++], str);
        }
        
        return answer;
    }
    
    public String getString(int[] part, String my_string) {
        return my_string.substring(part[0], part[1] + 1);
    }
}
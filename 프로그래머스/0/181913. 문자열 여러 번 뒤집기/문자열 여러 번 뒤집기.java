class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int i = 0; i < queries.length; i++) {
            answer = "";
            
            int s = queries[i][0];
            int e = queries[i][1];
            
            if(s > 0) answer += my_string.substring(0, s);
            
            String str = my_string.substring(s, e + 1);
            answer += new StringBuilder(str).reverse().toString();
            
            if(e != my_string.length() - 1) answer += my_string.substring(e + 1);
            
            my_string = answer;
        }
        
        return answer;
    }
}
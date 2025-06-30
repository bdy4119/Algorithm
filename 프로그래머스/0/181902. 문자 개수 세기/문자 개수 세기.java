class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++) {
            int n = 0;
            
            char iCh = my_string.charAt(i);
            Boolean b = Character.isUpperCase(iCh);
            
            for(int j = 0; j < my_string.length(); j++) {
                char jCh = my_string.charAt(j);
                
                if(iCh == jCh) n++;
            }
            
            if(b) answer[iCh % 65] = n;
            else answer[26 + iCh % 'a'] = n;
        }
        
        return answer;
    }
}
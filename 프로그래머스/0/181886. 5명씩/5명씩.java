class Solution {
    public String[] solution(String[] names) {
        int arrCnt = names.length / 5 + (names.length % 5 != 0 ? 1 : 0);
        String[] answer = new String[arrCnt];
        
        int cnt = 0;
        if(names.length % 5 == 0) {
            for(int i = 0; i < names.length; i += 5) {
                answer[cnt] = names[i];
                cnt++;
            }
        }
        else {
           for(int i = 0; i < names.length; i += 5) {
               if(i - names.length > 0
                    && names.length / i == 0) answer[cnt] = names[i+1];
               else answer[cnt] = names[i];
               cnt++;
            } 
        }
        
        return answer;
    }
}
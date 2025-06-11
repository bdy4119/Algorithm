class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int falseCnt = 0;
        for(boolean b : finished) {
            if(!b) falseCnt++;
        }
        
        String[] answer = new String[falseCnt];
        int cnt = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }
      
        return answer;
    }
}
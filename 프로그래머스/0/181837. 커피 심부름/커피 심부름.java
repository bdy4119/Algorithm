class Solution {
    public int solution(String[] order) {
        
        int americano = 0;
        int latte = 0;
        
        for(int i = 0; i < order.length; i++) {
            String orderStr = order[i];
            
            if(orderStr.contains("cafelatte")) latte += 1;
            else if(orderStr.contains("americano") 
                    || orderStr.contains("anything")) americano += 1;
        }
        
        return americano * 4500 + latte * 5000;
    }
}
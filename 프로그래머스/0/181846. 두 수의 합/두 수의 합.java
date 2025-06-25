import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        return getNumber(a).add(getNumber(b)) + "";
    }
    
    public BigInteger getNumber(String num) {
        return new BigInteger(num);
    }
}
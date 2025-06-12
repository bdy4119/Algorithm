import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String[] strArr = Arrays.stream(str_list)
                                .filter(str -> !str.contains(ex))
                                .toArray(String[] :: new);
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) sb.append(str);
        
        return sb.toString();
    }
}
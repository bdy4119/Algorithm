import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = Arrays.stream(myString.split("x"))
                        .filter(s -> !s.isEmpty())
                        .sorted()
                        .toArray(String[]::new);

return answer;

    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String result = "";
        while(n > 0) {
            result += str;
            n--;
        }
        
        System.out.print(result);
    }
}
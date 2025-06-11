import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        
        String result = "";
        for(String str : a) {
            String upper = str.toUpperCase();
            String lower = str.toLowerCase();
            
            if(str.equals(upper)) result += lower;
            else if(str.equals(lower)) result += upper;
        }
        
        System.out.print(result);
    }
}
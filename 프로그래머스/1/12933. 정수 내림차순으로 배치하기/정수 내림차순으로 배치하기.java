class Solution {
    public static long solution(long n) {
        String strN = String.valueOf(n);
        String[] arr = strN.split("");
        
        StringBuilder strbuild = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
           for(int j = i+1; j < arr.length; j++) {
               if(Long.valueOf(arr[i]) < Long.valueOf(arr[j])) {
                   String n1 = arr[i];
                   arr[i] = arr[j];
                   arr[j] = n1;
               } 
           }
        }
        
        for(String s : arr) {
            strbuild.append(s);
        }
        
        return Long.valueOf(strbuild.toString());
    }
}
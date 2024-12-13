//{ Driver Code Starts
// initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.RedOrGreen(N, S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        int result = Integer.MAX_VALUE;
       Map<Character, Integer> map = new HashMap<>();
       for(char c : S.toCharArray()){
           map.put(c, map.getOrDefault(c,0)+1);
       }
       if(map.size() == 1){
           return 0;
       }
       for(char c : map.keySet()){
           if(map.get(c) < result){
               result = map.get(c);
           }
       }
       
       return result;
    }
}
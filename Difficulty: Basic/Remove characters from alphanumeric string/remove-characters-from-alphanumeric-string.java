//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeCharacters(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeCharacters(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
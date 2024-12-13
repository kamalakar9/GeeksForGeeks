//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.removeConsonants(s));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                result.append(c);
            }
        }
        
        if(result != null && result.length() > 0){
            return result.toString();
        }
        return "No Vowel"; 
    }
    
}

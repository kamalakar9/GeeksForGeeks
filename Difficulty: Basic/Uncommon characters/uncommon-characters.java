//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map1 = new HashMap<>();
         Map<Character, Integer> map2 = new HashMap<>();
        for(char c : A.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        
        for(char c : B.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        
        for(char c : map1.keySet()){
            if(!map2.containsKey(c)){
                result.append(c);
            }
        }
        for(char c : map2.keySet()){
            if(!map1.containsKey(c)){
                result.append(c);
            }
        }
         if (result.length() == 0) {
            return "-1";
        }
         char[] resultArray = result.toString().toCharArray();
        Arrays.sort(resultArray);
        
        return new String(resultArray);
    }
}
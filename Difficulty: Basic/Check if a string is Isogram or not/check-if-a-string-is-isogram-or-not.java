//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        
System.out.println("~");
}
	 }
}
// } Driver Code Ends





class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : data.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : map.keySet()){
            if(map.get(c) > 1){
                return false;
            }
        }
        return true;
    }
    
}
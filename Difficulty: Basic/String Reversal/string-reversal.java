//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                
System.out.println("~");
}
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        s = s.replace(" ", "");
        for(int i = s.length() - 1; i >= 0; i--) {
        	char c = s.charAt(i);
        	if(!map.containsKey(c)) {
        		result.append(c);
        		map.put(c,1);
        	}
        }
        return result.toString();
        
    }
}
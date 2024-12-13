//{ Driver Code Starts
//Initial Template for Java


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
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : str){
            word = word.substring(0, 1).toUpperCase()+ word.substring(1).concat(" ");
            sb.append(word);
        }
        return sb.toString();
    }
}
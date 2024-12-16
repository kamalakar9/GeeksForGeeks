//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
        java.util.Map<Character, Integer> charCount = new java.util.HashMap<>();
        
        
        char prevChar = '\0';
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (currentChar != prevChar) {
                if (prevChar != '\0') {
                    charCount.put(prevChar, charCount.getOrDefault(prevChar, 0) + 1);
                }
                prevChar = currentChar;
            }
        }
        if (prevChar != '\0') {
            charCount.put(prevChar, charCount.getOrDefault(prevChar, 0) + 1);
        }
        for (int count : charCount.values()) {
            if (count == N) {
                result++;
            }
        }
        
        return result;
    }
}
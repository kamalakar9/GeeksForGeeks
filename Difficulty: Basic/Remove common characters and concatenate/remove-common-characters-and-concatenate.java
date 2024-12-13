//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
         
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }
        
        set1.retainAll(set2);
        
        StringBuilder s1Modified = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (!set1.contains(c)) {
                s1Modified.append(c);
            }
        }
        
        StringBuilder s2Modified = new StringBuilder();
        for (char c : s2.toCharArray()) {
            if (!set1.contains(c)) {
                s2Modified.append(c);
            }
        }
        
        String result = s1Modified.toString() + s2Modified.toString();
        if (result.isEmpty()) {
            return "-1";
        }
        
        return result;
    }
}

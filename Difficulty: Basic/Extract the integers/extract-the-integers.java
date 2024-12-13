//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        
System.out.println("~");
}
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        StringBuilder currentNumber = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
    
            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    result.add(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }
        
        if (currentNumber.length() > 0) {
            result.add(currentNumber.toString());
        }
        
        return result; 
    }
} 
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    
System.out.println("~");
}
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        
        long sum = 0;
        StringBuilder currentNumber = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                currentNumber.append(c);
            }
            else{
                if(currentNumber.length() > 0){
                    sum += Long.parseLong(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }
        if(currentNumber.length() > 0){
            sum += Long.parseLong(currentNumber.toString());
        }
        
        return sum;
        
    }
    
}
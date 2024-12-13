//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1){
	    
	    HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s1.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        int deletions = 0;
        
        HashMap<Character, Integer> allChars = new HashMap<>();
        allChars.putAll(map1);
        allChars.putAll(map2);
        
        for(char c : allChars.keySet()){
            int count1 = map1.getOrDefault(c, 0);
            int count2 = map2.getOrDefault(c, 0);
            deletions += Math.abs(count1 - count2);
        }
        return deletions;
	    
	}
       
}
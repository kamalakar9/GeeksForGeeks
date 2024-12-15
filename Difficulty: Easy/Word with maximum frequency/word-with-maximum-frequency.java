//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;


// } Driver Code Ends
class Solution {
    public String maximumFrequency(String str) {
        
        String[] strArray = str.split("\\s+");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String s : strArray) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		int maxValue = 0;
		String resKey = "";
		for (String key : map.keySet()) {
			if (maxValue < map.get(key)) {
				maxValue = map.get(key);
				resKey = key;
			}
			
		}
		 return resKey+" "+map.get(resKey);
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            Solution sol = new Solution();
            System.out.println(sol.maximumFrequency(str));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends
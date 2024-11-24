//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] a = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                a[i] = Integer.parseInt(numsStr[i]);
            }
            line = read.readLine().trim();
            numsStr = line.split(" ");
            int[] b = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                b[i] = Integer.parseInt(numsStr[i]);
            }
            Solution ob = new Solution();
            if (ob.isSubset(a, b))
                System.out.println("Yes");
            else
                System.out.println("No");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        if(a.length <= 0 || b.length <= 0){
            return false;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : b){
            if(!map.containsKey(num)){
                return false;
            }
            int countA = map.get(num);
            if(countA == 0){
                return false;
            }
            map.put(num, countA-1);
        }
        return true;
    }
}

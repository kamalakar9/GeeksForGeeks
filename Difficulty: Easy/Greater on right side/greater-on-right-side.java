//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().nextGreatest(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        
        int n = arr.length;
        int max_right = -1;
         ArrayList<Integer> result = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            int current = arr[i];
            arr[i] = max_right;
            max_right = Math.max(max_right, current);
        }
        for (int i = 0; i < n; i++) {
            result.add(arr[i]);
        }
         return result;
    }
}
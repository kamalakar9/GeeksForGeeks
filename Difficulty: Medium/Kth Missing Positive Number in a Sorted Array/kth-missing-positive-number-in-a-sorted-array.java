//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.kthMissing(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int kthMissing(int[] arr, int k) {
        
        int n = arr.length;
        int missingCount = 0;
        int previous = 0;
        
        for(int i = 0; i < n; i++){
            int current = arr[i];
            int missingInRange = current - previous - 1;
             if (missingCount + missingInRange >= k) {
                return previous + (k - missingCount);
            }
            
            missingCount += missingInRange;
            previous = current;
        }
         return previous + (k - missingCount);
    }
}
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
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        
        int n = arr.length;
        if(n< k){
            return -1;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            right += arr[i];
            left = Math.max(left, arr[i]);
        }
        
        int result = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canAllocate(arr, n, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
        
    }
    
    private static boolean canAllocate(int[] arr, int n, int k, int maxPages) {
        int studentCount = 1;
        int currentPages = 0;
        
        for (int i = 0; i < n; i++) {
            if (currentPages + arr[i] > maxPages) {
                studentCount++;
                currentPages = arr[i];
                if (studentCount > k) {
                    return false;
                }
            } else {
                currentPages += arr[i];
            }
        }
        
        return true;
    }
}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    void leftRotate(int arr[], int k) {
        
        int n = arr.length;
        k = k%n;
        rotateArray(arr, k, n-1);
        rotateArray(arr, 0, k-1);
        rotateArray(arr, 0, n-1);
        
    }
    
    static void rotateArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}






//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(a1[i]));
            }
            int k = Integer.parseInt(br.readLine());
            Solution ob = new Solution();

            ob.leftRotate(arr, k);
            for (int i = 0; i < arr.length; i++) out.print(arr[i] + " ");
            out.println();
        
out.println("~");
}
        out.close();
    }
}

// } Driver Code Ends
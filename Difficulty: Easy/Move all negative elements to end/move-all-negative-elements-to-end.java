//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T > 0) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] a = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            Solution ob = new Solution();
            ob.segregateElements(a);
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            T--;
        
System.out.println("~");
}
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        
        int n = arr.length;
        int[] positives = new int[n];
        int[] negitives = new int[n];
        int pCount = 0;
        int nCount = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                positives[pCount++] = arr[i];
            }
            else {
                negitives[nCount++] = arr[i];
            }
        }
        
        int k = 0;
        for(int i = 0; i < pCount; i++){
            arr[k++] = positives[i];
        }
        
        for(int i = 0; i < nCount; i++){
            arr[k++] = negitives[i];
        }
    }
}
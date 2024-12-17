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

            v = new Solution().customSort(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {

        int mid = arr.length / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, arr.length);
        
         for (int i = mid, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr){
            result.add(num);
        }
        
        return result;
    }
    
    
}
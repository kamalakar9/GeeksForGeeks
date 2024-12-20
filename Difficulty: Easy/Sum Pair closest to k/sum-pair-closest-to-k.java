//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int[] ans = ob.sumClosest(arr, k);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        int left = 0, right = n - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (Math.abs(currentSum - k) < Math.abs(closestSum - k)) {
                closestSum = currentSum;
                result[0] = arr[left];
                result[1] = arr[right];
            }
            else if (Math.abs(currentSum - k) == Math.abs(closestSum - k)) {
                if (Math.abs(arr[right] - arr[left]) > Math.abs(result[1] - result[0])) {
                    result[0] = arr[left];
                    result[1] = arr[right];
                }
            }
            if (currentSum < k) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
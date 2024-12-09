//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {

        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        
        int i = 0, j = 0, k = 0;
        boolean turnPositive = true;
        
        while (i < positives.size() && j < negatives.size()) {
            if (turnPositive) {
                arr.set(k++, positives.get(i++));
            } else {
                arr.set(k++, negatives.get(j++));
            }
            turnPositive = !turnPositive;
        }
        while (i < positives.size()) {
            arr.set(k++, positives.get(i++));
        }
        while (j < negatives.size()) {
            arr.set(k++, negatives.get(j++));
        }
    }
}
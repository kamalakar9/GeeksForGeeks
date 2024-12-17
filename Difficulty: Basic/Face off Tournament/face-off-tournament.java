//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            input = scanner.nextLine();
            String[] mn = input.split(" ");
            int m = Integer.parseInt(mn[0]);
            int n = Integer.parseInt(mn[1]);

            Solution solution = new Solution();
            System.out.println(solution.winner(arr, m, n));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    public String winner(int[] arr, int m, int n) {
        // code here
        int rohanCount = 0;
        int ramCount = 0;
        for(int i = 0; i<arr.length; i++){
             if(arr[i] % m == 0){
                 ramCount++;
             }
             else if(arr[i] % n == 0){
                 rohanCount++;
             }
        }
        
        if(ramCount > rohanCount){
            return "Ram";
        }
        else if(ramCount < rohanCount){
            return "Rohan";
        }
        else{
            return "Both";
        }
    }
}

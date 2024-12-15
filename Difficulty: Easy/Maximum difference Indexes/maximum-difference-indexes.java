//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


// } Driver Code Ends
import java.util.*;

class Solution {
    public int maxGap(List<Integer> arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int maxGap = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!map.containsKey(arr.get(i))) {
                map.put(arr.get(i), i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            int firstIndex = map.get(arr.get(i));
            int gap = i - firstIndex;
            maxGap = Math.max(maxGap, gap);
        }
        return maxGap;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            List<Integer> arr = Arrays.stream(input.split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());
            Solution solution = new Solution();
            System.out.println(solution.maxGap(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends
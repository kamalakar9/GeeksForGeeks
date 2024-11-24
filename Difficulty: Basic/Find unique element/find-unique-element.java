//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num , 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer val = entry.getValue();
            if(val != 1){
                continue;
            }
            res = entry.getKey();
        }
        
        return res;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(scanner.nextLine().trim());
            String[] inputLine = scanner.nextLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                arr[j] = Integer.parseInt(inputLine[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.findUnique(k, arr));
        
System.out.println("~");
}

        scanner.close();
    }
}

// } Driver Code Ends
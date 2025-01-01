//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>(); 
        
        for (String str : arr) {
            
            String key = getFrequencyKey(str);
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        for (ArrayList<String> group : map.values()) {
            result.add(group);
        }
        
        return result;
    }
    private String getFrequencyKey(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray); 
        return new String(charArray);
    }
    
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends
import java.util.*;

public class Solution4 {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] charCount = new int[26];

            for(char c : str.toCharArray()){
                charCount[c - 'a']++;
            }
            String key = Arrays.toString(charCount);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution4 solver = new Solution4();

        System.out.println("Enter the words one by one : ");
        String words = sc.nextLine();
        if(words.trim().isEmpty()){
            System.out.println("Result: []");
        }
        else{
            String[] strs = words.split("\\s+");
            List<List<String>> result = solver.groupAnagrams(strs);
            System.out.println("Grouped anagram: " + result);
        }
        sc.close();
    }
}
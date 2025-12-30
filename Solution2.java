import java.util.Scanner;


public class Solution2 {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] array = new int[26];

        for(int i = 0; i < s.length(); i++){
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }
        for(int count : array){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String s = sc.nextLine().toLowerCase();

        System.out.println("Enter the second string: ");
        String t = sc.nextLine().toLowerCase();

        Solution2 solution = new Solution2();

        boolean result = solution.isAnagram(s, t);

        if(result) {
            System.out.println("the string are anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
        sc.close();
    }
}

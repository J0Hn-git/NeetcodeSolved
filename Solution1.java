import java.util.*;

public class Solution1 {
    public boolean hasDuplicate(int[] nums){
        if(nums.length == 0){
            return false;
        }
        Set<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            else{
                seen.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1 sol = new Solution1();
        
        System.out.println("Enter number seperated by spaces: ");
        String input = sc.nextLine();

        String[] parts = input.split("\\s+");
        int[] nums = new int[parts.length];

        try {
            for(int i = 0; i < parts.length; i++){
                nums[i] = Integer.parseInt(parts[i]);
            }
            boolean result = sol.hasDuplicate(nums);
            if(result){
                System.out.println("Result: true");
            }
            else{
                System.out.println("Result: false");
            }


        } catch (Exception e) {
            System.out.println("Error: Please enter valid inteegers only");
        }
        sc.close();
    }
}
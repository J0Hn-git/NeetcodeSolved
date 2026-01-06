import java.util.*;

public class Solution3{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            int complement = target - num;

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(num, i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution3 solver = new Solution3();

        System.out.println("Enter the number: ");
        String[] parts = scanner.nextLine().split("\\s+");
        int[] nums = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();

        int[] result = solver.twoSum(nums, target);

        if(result.length == 2){
            System.out.println("Indices: [" + result[0] + "," + result[1] + "]");
        }
        else{
            System.out.println("No solution found");
        }
        scanner.close();
    }
}
import java.util.*;

public class Solution6 {
    public static int removeElement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        sc.close();
    }
}

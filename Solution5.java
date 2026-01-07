import java.util.*;

public class Solution5 {
    public int[] topkFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
        new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.offer(entry);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : minHeap){
            result[i++] = entry.getKey();
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution5 solver = new Solution5();

        System.out.println("Enter the numbers : ");
        String[] parts = scanner.nextLine().split("\\s+");
        int[] nums = new int[parts.length];

        for(int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        int[] result = solver.topkFrequent(nums, k);
        System.out.println("Top " + k + "elements " + Arrays.toString(result));

        scanner.close();
    }
}

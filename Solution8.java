import java.util.*;

public class Solution8 {
    public static int[] plusone(int[] digits){

        if(digits.length == 0){
            return new int[0];
        }

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] results = new int[digits.length + 1];
        results[0] = 1;
        return results;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of input: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the number one by one: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] output = plusone(arr);

        System.out.println("Result after : ");
        for(int num : output){
            System.out.println(num + " ");
        }
        sc.close();
    }
}
import java.util.*;

public class Solution9 {
    public static void mergeArray(int[] nums1, int m , int[] nums2, int n){

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m];

        System.out.println("enter the elements for first array: ");
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of second array: ");
        int n = sc.nextInt();
    }
}

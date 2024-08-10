import java.util.*;
class Solution{
    public int findPeakElement(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid] < nums[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
public class findPeakElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.findPeakElement(nums);
        System.out.println("Peak Element is :" +result);
    }
}
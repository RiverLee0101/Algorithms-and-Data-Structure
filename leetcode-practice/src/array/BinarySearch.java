package array;

/**
 * @Author: 11101453
 * @Date: 2019/9/29
 */
public class BinarySearch {
    /*
    * 非递归二分查找（while 循环）
    */
    public static int binarySearch(int[] nums, int target){
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;

        if(target < nums[lo] || target > nums[hi] || lo > hi){
            return -1;
        }
        
        while (lo <= hi){
            mid = (hi+lo)/2;
            if(target < nums[mid]){
                hi = mid - 1;
            }else if(target > nums[mid]){
                lo = mid + 1;
            }else return mid;
        }
        return -1;
    }
    
    /*
    * 递归二分查找
    */
    public static int recursionBinarySearch(int[] nums, int target, int lo, int hi){
        // 验证输入正确性
        if(target < nums[lo] || target > nums[hi] || lo > hi){
            return -1;
        }  
        
        int mid = (lo+hi)/2;
        if(target < nums[mid]){
            return recursionBinarySearch(nums, target, lo, mid-1);
        }else if(target > nums[mid]){
            return recursionBinarySearch(nums, target, mid+1, hi);
        }else return mid;
    }
    
    
    public static void main(String[] args){
        int[] nums = {1,2,4,6,7,12,15,18,20};
        System.out.println("非递归查找target的位置是："+binarySearch(nums, 18));
        System.out.println("递归查找target的位置是："+recursionBinarySearch(nums, 20, 0, 8));
    }
}

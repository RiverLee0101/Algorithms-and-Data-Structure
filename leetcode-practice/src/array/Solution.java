package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 11101453
 * @Date: 2019/9/28
 */
public class Solution {
    
    /**
     * @1. 两数之和
     */
    public static int[] twoSum(int[] nums, int target){
        int sum;
        int[] result = new int[2];
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length-1; i++){
             if(map.containsKey(target-nums[i])){
                 return new int[] {map.get(target-nums[i]), i};
             }
             map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    
    /**
     * @26. 删除排序数组中的重复项
     * @输入： nums = [0,0,1,1,1,2,2,3,3,4]
     * @输出： 5，且原数组前5个元素被修改为：0, 1, 2, 3, 4
     */
//    public static  int removeDuplicates(int[] nums){
//        
//    }
    
    public static void main(String args[]){
        // test 1
//        int[] nums = {3,2,3};
//        System.out.println(Arrays.toString(twoSum2(nums, 6)));
        
        // test 26
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //System.out.println(removeDuplicates(nums));
    }
}

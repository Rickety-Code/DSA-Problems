import java.util.*;

public class ArithmeticTriplets {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,9};
        int diff = 2;
        System.out.println(arithmeticTriplets(nums, diff));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                if(s.contains(nums[i] + diff)){
                    if(s.contains(nums[i] + diff+diff)){
                        result++;
                    }
                }
            }  
        }
        return result;
    }
}

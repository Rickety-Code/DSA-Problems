
import java.util.HashMap;
import java.util.HashSet;

public class SubarrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {1,4,13,-3,-10,5};
        
        // System.out.println(naive(arr,arr.length));
        // System.out.println(prefixPlusHashing(arr,arr.length));
        System.out.println(largestSubarraySum(arr,arr.length));
    }
    private static int largestSubarraySum(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            } else {
                if(map.containsKey(sum)){
                    max = Math.max(max,i-map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }

    private static boolean prefixPlusHashing(int[] arr, int n){
        HashSet<Integer> s = new HashSet<>();
        int prefix_sum = 0;
        for(int i=0;i<n;i++){
            prefix_sum += arr[i];
            if(s.contains(prefix_sum))
            return true;
            if(prefix_sum == 0)
            return true;
            s.add(prefix_sum);
        }
        return false;
    }

    private static boolean naive(int[] arr,int n){
        //TC=O(n2), SC=O(1)
        for(int i=0;i<n;i++){
            int curr_sum =0;
            for(int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum == 0)
                return true;
            }
        }
        return false;
    }
}

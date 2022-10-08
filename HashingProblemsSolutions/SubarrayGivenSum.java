import java.util.HashSet;

public class SubarrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        //prefix sum array = {5,13,19,32,35,34}
        //35-22 = 13(13 in hashtable)
        int sum = 22;

        System.out.println(naive(arr,sum));
        System.out.println(prefixPlusHashing(arr,sum));
    }
    private static boolean prefixPlusHashing(int[] arr, int sum){
        HashSet<Integer> s = new HashSet<>();
        int prefix_sum = 0;
        for(int i=0;i<arr.length;i++){
            prefix_sum += arr[i];
            if(prefix_sum == sum)
            return true;
            if(s.contains(prefix_sum-sum))
            return true;
            s.add(prefix_sum);
        }
        return false;
    }

    private static boolean naive(int[] arr, int sum){
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            for(int j=i;j<arr.length;i++){
                temp += arr[j];
                if(temp == sum)
                return true;
            }
        }
        return false;
    }
}

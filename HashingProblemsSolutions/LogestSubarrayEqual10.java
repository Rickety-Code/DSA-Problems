import java.util.Arrays;
import java.util.HashMap;
 

public class LogestSubarrayEqual10 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0};

        // System.out.println(naive(arr));
        System.out.println(prefixHashing(arr));
        System.out.println(Arrays.toString(arr));

    }
    private static int prefixHashing(int[] arr){
        HashMap<Integer,Integer> s = new HashMap<>();
        int maxlen = 0;
        int prefix_sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) arr[i] = -1;
            prefix_sum += arr[i];

            if(prefix_sum == 0){
                maxlen = i+1;
            } else {
                if(s.containsKey(prefix_sum)){
                    maxlen = Math.max(maxlen,i-s.get(prefix_sum));
                } else {
                    s.put(prefix_sum, i);
                }
            }
        }
        return maxlen;
    }

    private static int naive(int[] arr){
        //tc = o(n2)
        int result = 0;
        for(int i=0;i<arr.length;i++){
            int zero = 0, one = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0)
                zero++;
                else
                one++;
                if(zero == one){
                    result = Math.max(result,j-i+1);
                }
            }
        }
        return result;
    }
}

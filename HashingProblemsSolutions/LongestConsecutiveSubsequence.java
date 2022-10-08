import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int []arr = {1,9,3,4,2,20};  //      o/p-4:{1,3,4,2}
        
        System.out.println(sorting1(arr));
        System.out.println(hashing(arr));
    }
    private static int hashing(int []arr){
        //tc = O(n), sc = O(n)
        HashSet<Integer> s = new HashSet<>();
        for(int x : arr){
            s.add(x);
        }

        int maxlen = 0;  
        for(int i=0;i<arr.length;i++){
            int temp = 0;
            if(!s.contains(arr[i]-1)){
                temp++;
                while(s.contains(arr[i]+temp))
                temp++;
            }
            maxlen = Math.max(maxlen, temp);
        }
        return Math.max(maxlen, maxlen);
    }

    private static int sorting1(int[] arr){
        //tc = O(nlogn), sc = O(1)
        Arrays.sort(arr); //{1,2,3,4,9,20}
        int result = 1, currMax = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]+1){
                currMax++;
            } else{
                result = Math.max(result,currMax);
                currMax = 1;
            }
        }
        return result = Math.max(result,currMax);
    }
}

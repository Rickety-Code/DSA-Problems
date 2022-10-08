import java.util.HashMap;

public class DistinctEveryWindow {
    public static void main(String[] args) {
        int arr[] = {10,20,20,10,30,40,10};
        int k=4;

        acquireAndRelease(arr,k);
    }

    private static void acquireAndRelease(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();   //value, freq
        int i=0;
        while(i<=k-2){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            i++;
        }
        i--;
        int j=-1;
        while(i<arr.length-1){
            i++;
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);  //will acquire
            System.out.print(map.size()+" ");  //will work
            j++; //will release (here to downwards code)
            int freq = map.get(arr[j]);
            if(freq == 1){
                map.remove(arr[j]);
            } else {
                map.put(arr[j], freq-1);
            }
        }

    }
}

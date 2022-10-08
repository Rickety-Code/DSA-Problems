import java.util.*;

public class CountDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer []arr = {15,12,13,12,13,13,18};

        // HashSet<Integer> hset = new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     hset.add(arr[i]);
        // }

        HashSet<Integer> hset = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println(hset.size());

        sc.close();
    }
}

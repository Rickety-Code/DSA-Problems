import java.util.*;

public class  CountFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer []arr = {10,12,10,15,10,20,12,12};
        HashMap<Integer,Integer> hmap = new HashMap<>(); //unordered traversal
        // LinkedHashMap<Integer,Integer> hmap = new LinkedHashMap<>(); //ordered traversal
        // for(int i=0;i<arr.length;i++){
        //     Integer c = hmap.get(arr[i]);
        //     if(hmap.get(arr[i]) == null){
        //         hmap.put(arr[i],1);
        //     } else {
        //         hmap.put(arr[i],++c);
        //     }
        // }

        for(int x : arr){
            hmap.put(x, hmap.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hmap.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println(hmap);

        sc.close();
    }
}

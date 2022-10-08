import java.util.HashSet;

public class UnionArrays {
    public static void main(String[] args) {
        int []a = {15,20,5,15};
        int []b = {15,15,15,20,10};
        
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }

        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        System.out.println(s.size());
    }
}

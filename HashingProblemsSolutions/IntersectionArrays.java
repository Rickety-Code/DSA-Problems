import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        int a[] = {10,12,20,15,30,30,5};
        int b[] = {30,5,30,80};

        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        int count = 0;

        for(int j=0;j<b.length;j++){
            if(s.contains(b[j])){
                
                System.out.println(s.remove(b[j]));
                count++;
            }
        }
        System.out.println(count);
    }
}

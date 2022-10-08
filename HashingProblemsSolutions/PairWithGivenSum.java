import java.util.HashSet;
class PairWithGivenSum {
    public static void main(String[] args) {
        int []arr = {3,2,8,15,-8};
        int sum = 7;

        boolean check = true;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(s.contains(sum-arr[i])){
                check = false;
                System.out.println("true");
                break;
            } else {
                s.add(arr[i]);
            }
        }
        if(check)
        System.out.println("FAlse");
    }
}

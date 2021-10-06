class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int vowelCount = 0;
        for(int i=0; i<n/2; i++){
            switch(s.charAt(i)){
                case 'a' : ;
                case 'e' : ;
                case 'i' : ;
                case 'o' : ;
                case 'u' : ;
                case 'A' : ;
                case 'E' : ;
                case 'I' : ;
                case 'O' : ;
                case 'U' : vowelCount++;
            }
        }
        for(int i=n/2; i<n; i++){
            switch(s.charAt(i)){
                case 'a' : ;
                case 'e' : ;
                case 'i' : ;
                case 'o' : ;
                case 'u' : ;
                case 'A' : ;
                case 'E' : ;
                case 'I' : ;
                case 'O' : ;
                case 'U' : vowelCount--;
            }
        }
        return vowelCount==0 ? true : false;
    }
}

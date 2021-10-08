class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x == 0) {        //If the number is 0, then return true
            return true;
        }
        if(x < 0) {         // If the number is negative, negate it to make it positive before reversing
            x = -1*x;
        }
        int reverse = 0, num = x;  
        while(num != 0)     // Reverse the number and store it in reverse
        {  
            int rem = num % 10;  
            reverse = reverse * 10 + rem;  
            num = num/10;  
        }
        return ((reverse - x) == 0);     // If the difference is 0, the number is a palindrome
    }
}
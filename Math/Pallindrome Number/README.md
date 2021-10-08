## Problem Statement
Given an integer, return true if it is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

## Code
```java
public boolean isPalindrome(int num) {
  int n = num;
  int rev = 0;
  while (num > 0)
  {
      int dig = num % 10;
      rev = rev * 10 + dig;
      num = num / 10;
  }
  return n == rev;
}
```

## Solution
The proposed solution remove one digit at a time constructing a reverse integer. In the end if the reverse integer is equal to the original integer, then the number entered is palindrome.

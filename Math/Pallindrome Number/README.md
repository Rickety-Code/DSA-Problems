## Problem Statement
Given an integer, return true if it is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

## Code
```java
public boolean isPalindrome(int x) {
  if(x == 0) {
    return true;
  }
  if(x < 0) {
    x = -1*x;
  }
  int reverse = 0, num = x;
  
  while(num != 0)   
  {  
    int rem = num % 10;  
    reverse = reverse * 10 + rem;  
    num = num/10;  
  }
  return ((reverse - x) == 0);  
}
```

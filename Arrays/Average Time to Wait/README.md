## Problem Statement
There is a garage with a single mechanic. You are given an array `customers`, where `customers[i] = [arrival_i, time_i]:`

-   `arrival_i` is the arrival time of the `ith` customer. The arrival times are sorted in non-decreasing order.
-   `time_i` is the time needed to repair the car of the `ith` customer.

When a customer arrives, he gives the mechanic his car, and the chef starts repairing it once he is idle. The customer waits till the mechanic finishes repairing his order. The mechanic does not repair a car of more than one customer at a time. The mechanic repairs the car for customers in the order they were given in the input.

Return the average waiting time of all customers. Solutions shall be `10^-5` from the actual answer.

## Code
```java
public double avgTimeToWaiting(int[][] customers) {
  //complete the code        
}
```

## Solution

**Approach**
1. Keep a track of the current time `time` and total wait time `waitingTime`.
2. If the time of arrival of the next customer is greater than the current time, fast forward to that time `time = Math.max(cust[0],time)`
3. Increament the time with the time required to prepare the dish `time = time + cust[1]`
4. Calculate the total time `customer[i]` had to wait and add it to total time.
5. Divide by the total no. of customers to get average.

```
time -> 0
waiting time -> 0
for all customers
    time = max(cust[0], time);            
    time = time + cust[1];
    waitingTime = waitingTime + (time - cust[0]);
    
Answer -> waitingTime/lenght(customers)
```

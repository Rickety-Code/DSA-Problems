## Problem Statement
There is a special kind of apple tree that grows apples every day for `n` days. On the `ith` day, the tree grows `apples[i]` apples that will rot after `days[i]` days, that is on day `i + days[i]` the apples will be rotten and cannot be eaten. On some days, the apple tree does not grow any apples, which are denoted by `apples[i] == 0` and `days[i] == 0`.

You decided to eat **at most** one apple a day (to keep the doctors away). Note that you can keep eating after the first `n` days.

Given two integer arrays `days` and `apples` of length `n`, return the maximum number of apples you can eat.

## Code
```java
public int eatenApples(int[] apples, int[] days) {
	//COmplete Code here        
}
```

## Solution
**Approach**

To solve the problem, approach it in a way that on the nth day you collect all the apples from the tree in a basket and label it with the day upto which they can be consumed. Let us declare the basket as 
```
class Basket{
        int appleCount; // represents the count of apples in basket
        int day; // represents the day upto which these apples can be consumed
    }
```
Now as the problem statement say that we need to find the max. day the apples will last, we need to devise a way of consuming the apples such that the last for the longest period of time.
*(Try to relate it with a real life situation where you have multiple tasks, each equally important. Which one would you prefer to do first? The ones with the closest deadline. Right?)*
Let us take an example of two buckets having three apples each with the day till when they can be consumed as 3 and 5 respectively.
Now consider two cases 
1. If we eat the apple from bucket with a late rotting day then after 3 days we'll consume 3 apples from second bucket. On the 4th day there are no apples left in the second bucket and the apples in first bucket have rotten. Hence we could only consume 3 apples.
2. If we the apple from bucket with an early rotting day then after 3 days we'll consume all 3 apples from first bucket. Then on the 4th and 5th day we consume one apple from second bucket after which they'll rot. So we have consumed a total of 5 apples.

From the above one could figure out that a very obvious thing about the solution is that you would want to first eat all the apples that are likely to rot earlier than the others. So, to serve this purpose we can create a priority queue that will keep the basket whose apples are going to rot earliest at the very first, and that's where we are going to consume our apples from.
```
PriorityQueue<Basket> q = new PriorityQueue<>(n,(b1,b2) -> b1.day-b2.day)
```

Now at each day we would want to do 3 things:
1. Remove all the baskets whose apples are rotten.
```
	while(q.peek()!=null && (q.peek().appleCount < 1 || q.peek().day < i+1))
		q.poll();
```
2. Collect all the apples from the tree and place the basket in the queue (only if there are any apples on the tree and they will last atleast one day).
```
	if(apples[i] != 0 && days[i] !=0){
		q.add(new Basket(apples[i], i+days[i]));
	}
```
3. Consume an apple (if available)
```
	if(q.peek()==null) continue;           
	q.peek().appleCount--;
	apple++;
```
After all the apples are collected for the n days. We need to check how long the remaining apples in the baskets will last. For this pick up a basket from the queue, then keep consuming the apples until either the apples are finished or all apples in the basket are rotten.

```
while(q.peek() != null){
	Basket basket = q.poll();
	if(basket.day < i) continue;
	apple += Math.min(basket.appleCount, basket.day-i);
	i += Math.min(basket.appleCount, basket.day-i);
}
```
<br>

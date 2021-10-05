## Problem Statement
A cafeteria offers `0` and `1`  category of sandwitched. All people stand in a queue. Each person either prefers type 0 or type 1 sandwiches.

The number of sandwiches in the cafeteria is equal to the number of people. The sandwiches are placed in a stack. 

Following action can be performed for each person:
-   If the person at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
-   Otherwise, they will leave it and go to the queue's end.

This continues until none of the people want to take the top sandwich and are thus are unable to eat.

You are given two integer arrays `people` and `sandwiches` where `sandwiches[i]` is the type of the `ith` sandwich and `people[j]` is the preference of the `jth` person in the initial queue (`j = 0` is the front of the queue). Return  the number of people who are unable to eat.

## Code
``` java
public int countStudents(int[] people, int[] sandwiches) {
    // complete code
}
```

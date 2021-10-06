## Problem Statement
A cafeteria offers `0` and `1`  category of sandwitches. All people stand in a queue. Each person either prefers type 0 or type 1 sandwiches.

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

## Solution
**Approach #1**
The question states that *"This(the queue) continues until none of the people want to take the top sandwich and are thus are unable to eat."*. And that's what you might want to do!!!
Create a queue and run a loop until 
1). either all the sandwiches are taken up *(then return zero)* or 
2). no one in the queue is ready to take the top sandwich *(then return the number of people left in the queue)*.

**Approach #2**
Diving a bit into the question, the repetition of the queue indicates a circular fashion. So to check if the sandwich at the top of the stack is going to be consumed we only need to check that if there is a person anywhere in the queue who wants a sandwich of the same type or not.

Also, thinking about the above explanation in **Approach#1**, the point at which we are going to meet the 2nd condition is when there is no one in the queue who wants the sandwich at the top of the stack i.e. either the condition that sandwich of type **1** is at the top and everyone in the queue want a sandwich of type **0** or vice versa is true.

Keeping the above two in mind, all we need to do is calculate the no. of people who need the sandwich of type0 and type1 separately, then for every `sandwich[i]` check if there is someone in the queue who need the sandwich of the same type. If yes allocate the sandwich to him and decrease the count of people who want the sandwich of the same type. Else as there is no one in the queue who wants the sandwich, all the remaining students will not be able to eat lunch!

```
ones = 0  -> count of those who prefer type1
zeros = 0 -> count of those who prefer type0
for each person
    if he/she prefer type0 then zeros++
    else ones++

for each sanditch in stack
    if sandwich is of type0
        and if no one want a type0 sandwich
            return ones;
        else zeros--;

    if sandwich is of type1
        and if no one want a type1 sandwich 
            return zeros;
        else ones--;

if nothing returned so far, all people have eaten hence ans = 0

```

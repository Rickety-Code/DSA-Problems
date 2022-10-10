## Problem statement
Given the head of a linked list, remove the nth node from the end of the list. The solution should return the head of the newly created linked list.

Conditions : `n <= length of linked list`

A Linked list node can be considered to be defined as:

### Java
```java
public class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) { 
    	this.val = val; this.next = next; 
	}
}
```
### Python
```python
class Node:
    def __init__(self, new):
        self.data = new
        self.next = None
```

## Code

### Java
```java
public Node removeNthFromEnd(Node head, int n) {
	// Compete code here
}
```

### Python
```python
def deleteNthNode(self, n):
	first_node = self.head
	second_node = self.head
	for i in range(n):
	    if(second_node.next == None):
		if(i == n - 1):
		    self.head = self.head.next
		return self.head
	    second_node = second_node.next
	while(second_node.next != None):
	    second_node = second_node.next
	    first_node = first_node.next
	first_node.next = first_node.next.
```

## Solution

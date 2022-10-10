class Node:
    def __init__(self, new):
        self.data = new
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        
    def addNode(self, new):
        new_node = Node(new)
        new_node.next = self.head
        self.head = new_node
        
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
        first_node.next = first_node.next.next
        
    def print(self):
        head = self.head
        while(head != None):
            print(head.data, end = ' ')
            head = head.next

### Test Code
llist = LinkedList()
llist.addNode(1)
llist.addNode(2)
llist.addNode(3)
llist.print()
llist.deleteNthNode(1)
llist.print()

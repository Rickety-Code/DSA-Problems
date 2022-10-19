#include <bits/stdc++.h>
using namespace std;

// Structure of node
struct Node
{
    int data;
    struct Node *next;
};

// Function to insert node in a linked list
struct Node *create(struct Node *head, int x)
{
    struct Node *temp, *ptr = head;
    temp = new Node();
    temp->data = x;
    temp->next = NULL;
    if (head == NULL)
        head = temp;
    else
    {
        while (ptr->next != NULL)
        {
            ptr = ptr->next;
        }
        ptr->next = temp;
    }
    return head;
}

// Function to remove nth node from last
Node *removeNthFromEnd(Node *head, int n)
{
    Node *start = new Node();
    start->next = head;
    Node *fast = start;
    Node *slow = start;
    
    // Traverse the LinkedList n times
    for (int i = 0; i < n; i++)
    {
        fast = fast->next;
    }

    // Increase the slow pointer && fast pointer
    while (fast->next != NULL)
    {
        fast = fastPtr->next;
        slow = slowPtr->next;
    }

    // Deletion step
    slow->next = slow->next->next;

    // Return head
    return start->next;
}

// sisplay function prints the linked list strating from head
void display(struct Node *head)
{
    struct Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

//Drivers code
int main()
{
    struct Node *head = NULL;
    head = create(head, 1);
    head = create(head, 2);
    head = create(head, 3);
    head = create(head, 4);
    head = create(head, 5);

    int n = 2;

    cout << "Linked list before modification: \n";
    display(head);

    head = removeNthFromEnd(head, 2);
    cout << "Linked list after modification: \n";
    display(head);
    return 0;
}

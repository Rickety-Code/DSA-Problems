// This program will help us to add an element at any position in a singly linked list.
// Also this program will help us to insert a node at the end of the list.

import java.util.*;;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
}

public class Solution{

    ListNode start = null;

    void add_node(int data) // to add the data at the end of the linked list
    {
        ListNode node = new ListNode(data);
        if(start==null)// If true, it means there is no Linked list at all
        {
            start=node; // start and newptr both are pointing to the same node
        }
        else
        {
            ListNode ptr=start;// It means start and ptr both are pointing to the same node
        
        while(ptr.next!=null)
        {
            ptr=ptr.next;// the value/ address of ptr->link will be stored in ptr
        }
        ptr.next=node;// store the address of newptr to ptr->link.  
        //That is link the new node with the linked list
        }
    }

    void add_anypos(int pos,int data) // to add a the data at a particular position(stored in pos) of the linked list
    {
        int step=1;
        ListNode node = new ListNode(data);
        
        if(pos == 1){
            node.next=start;
            return;
        }

        ListNode temp = start;
    
        while(step<pos-1) 
        {	
            temp = temp.next;
            ++step;
        }
    
        node.next=temp.next;	//newptr->link points to the rest of the linked list after the given position
        temp.next = node;			//newptr is now added to the required position
    }
    
    
    void display()// to display the linked list
    {
        ListNode temp=start;// It means start and ptr both are pointing to the same node
    
        System.out.println("\nThe linked list is : \n");
    
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    

    public static void main(String args[]){

        int value,pos;
        int choice,choice_pos;

        Scanner sc = new Scanner(System.in);
        Solution S1 = new Solution();
       
        while(true)// while loop will execute for infinite time if the choice=='y'. 
        //If choice=='n' or choice=='N' it will stop
       {
            System.out.println("\nDo you want to insert(Press 1 for yes, 0 for no)?");
            choice = sc.nextInt();	//accepting user's choice if they want to add more data to the linked list or not
       
             if(choice == 1)
            {
       
            System.out.println("\nEnter the info:");
            value = sc.nextInt();// the value to be added to the linked list
       
       
            System.out.println("\nDo you want to insert the data at a particular position(Press 1 for yes, 0 for no)?");
            choice_pos = sc.nextInt();	//accepting user's choice if they want to add the data to a particular position or not
       
           if(choice_pos == 1){
                System.out.println("\nEnter the position: ");
                pos = sc.nextInt();	// the position at which the value is to be added
                S1.add_anypos(pos,value);
           }
           else    S1.add_node(value);	
       
           }
       
           else    break;
       
       }
       
       S1.display();// It will display the entire linked list
    }
}

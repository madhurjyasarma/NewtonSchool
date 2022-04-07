package LinkedLists;

public class LL1 {
        // head of the list
        Node head;

        // creating a Node class
        class Node{
            // Node has two part
            // A data i.e. of int type
            int data;
            // and a next part
            Node next;

            // constructor to create a new Node
            Node(int d) {data = d; next = null;}
        }

        // Push element at start of the LL
        public void push(int newData){
            // creating a newNode of Node datatype
            Node newNode = new Node(newData);

            // newNode is pointing to the head
            newNode.next = head;
            // making the newNode head
            head = newNode;
        }

        // Push element to the last
        public void last(int newData){
            // Creating a newNode of Node type
            Node newNode = new Node(newData);

            // If head is null
            if (head == null){
                // create a new Node and assign it to the head
                head = new Node(newData);
                // then return
                return;
            }

            // This newNode will be the last element so we make the next part as "null"
            newNode.next = null;
            // creating a Node called last to traverse the whole LL
            Node last = head;
            // Go to the end of the LL
            while (last.next != null){
                // traverse the LL with Node called last
                last = last.next;
            }
            // Now we are at the end of the LL
            // making the Node last's next as newNode
            last.next = newNode;
            // return
            return;

        }

        // Printing the LL
        public void printList(){
            // creating a Node named tNode and it's pointing to the head
            Node tNode = head;
            // while tNode is not null
            while (tNode != null){
                // print the data of tNode
                System.out.print(tNode.data+" ");
                // After printing go to the next Node in the LinkedList i.e. LL1
                tNode = tNode.next;
            }

        }
        // Driver code
        public static void main(String[] args) {
            // creating a new linked list named lList
            LL1 lList = new LL1();
            // adding elements into the lList
            lList.push(9);
            lList.push(6);
            // printing the lList
            lList.printList();
            System.out.println("------");
            lList.last(707);
            lList.printList();
        }

}

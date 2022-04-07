package LinkedLists;

public class LL2 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void pushFirst(int newData){
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        Node tempNode = head;

        while (tempNode.next != null){
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
    }

    void printLL2(){
        Node tNode = head;
        while(tNode != null){
            System.out.print(tNode.data+" ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        LL2 recentLL = new LL2();
        recentLL.pushFirst(6);
        recentLL.pushFirst(9);
//        recentLL.printLL2();
        recentLL.addLast(10);
        recentLL.printLL2();

    }
}

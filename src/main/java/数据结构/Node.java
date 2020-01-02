package 数据结构;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/2 13:23
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
//        System.out.println(node.toString());
//        while (node != null){
//            System.out.println(node.value);
//            node = node.next;
//        }



    }

    public static Node reverseList(Node head) {
        if(head == null || head.next  == null){
            return head;
        }
        Node node =  reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}




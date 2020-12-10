package 数据结构;

import java.util.Objects;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/2 13:23
 */
public class Node {
    private int value;
    private Node next;
    private Node head;

    public Node(int value){
        this.value = value;
    }

    public Node(){}

    public  void add(int value){
        Node node = new Node(value);
        if (Objects.isNull(head)){
            head = node;
            return ;
        }
        Node tmp = head;
        while (Objects.nonNull(tmp.next)){
            tmp = tmp.next;
        }
        tmp.next = node;
    }


    public static void main(String[] args) {
        Node node = new Node();
        node.add(1);
        node.add(12);
        node.add(3);
        node.add(4);
        node.add(4);
        node.add(8);
        print(node);
    }

    private static void print(Node node) {
        while (node.head != null){
            System.out.println(node.head.value);
            node.head = node.head.next;
        }



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




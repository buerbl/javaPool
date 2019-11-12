package 剑指offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @Author: boolean
 * @Date: 2019/11/10 20:51
 */
public class Title3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (Objects.isNull(listNode)){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tranformList = new ArrayList<>();
        while (listNode!=null){
            System.out.println(listNode.val);
            list.add(listNode.val);
            listNode = listNode.next;
        }
        for (int i = list.size()-1; i>=0; i--){
            tranformList.add(list.get(i));
        }
        return tranformList;
    }

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if (Objects.isNull(listNode.next)){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        printListFromTailToHead(listNode.next);
        System.out.println(listNode.val);
        return list;
    }


    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    @Test
    public  void test(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

//        ArrayList<Integer> integers = printListFromTailToHead(listNode);
//        System.out.println(Arrays.toString(integers.toArray()));

        printListFromTailToHead1(listNode);

    }

    @Test
    public void test1(){
       int[] a = {0,1};
        System.out.println(a[1]);
    }

    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(0, i);
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}




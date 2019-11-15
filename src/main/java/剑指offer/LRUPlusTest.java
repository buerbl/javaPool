package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * 1.每次新插入数据的时候将新数据插到链表的头部；
 * 2.每次缓存命中（即数据被访问），则将数据移到链表头部；
 * 3.那么当链表满的时候，就将链表尾部的数据淘汰。
 * @Author: boolean
 * @Date: 2019/11/12 16:39
 */
public class LRUPlusTest{
    private List<Integer> list;
    private final int size;
    public LRUPlusTest(int size){
        this.size = size;
        this.list = new ArrayList();
    }

    public void put(Integer target){
        if(target == null){
            return;
        }
        if(list.size() > size){
            list.remove(size-1);
        }
        list.add(0,target);
    }

    public void get(Integer target){
        if(target == null){
            return;
        }
        for(Integer i : list){
            if(target.equals(i)){
                list.remove(i);
                list.add(0, i);
                break;
            }
        }
        return;
    }

    public static void main(String[] args) {
            System.out.println("纯手打");
    }
}



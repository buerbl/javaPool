package 剑指offer;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @Description:
 * 1.每次新插入数据的时候将新数据插到链表的头部；
 * 2.每次缓存命中（即数据被访问），则将数据移到链表头部；
 * 3.那么当链表满的时候，就将链表尾部的数据淘汰。
 * @Author: boolean
 * @Date: 2019/11/12 9:57
 */
public class LRUTest<K,V> {
    /**
     * 最大缓存大小
     */
    private int cacheSize;
    private LinkedHashMap<K,V> cacheMap;

    public LRUTest(int cacheSize) {
        this.cacheSize = cacheSize;
        cacheMap = new LinkedHashMap(16, 0.75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                if (cacheSize + 1 == cacheMap.size()) {
                    return true;
                } else {
                    return false;
                }
            }
        };
    }

    public void put(K key, V value) {
        cacheMap.put(key, value);
    }

    public V get(K key) {
        return cacheMap.get(key);
    }

    public void forEach(BiConsumer<? super K, ? super V> action) {
       cacheMap.forEach(action);
    }
    public static void main(String[] args){
        LRUTest<String, String> stringStringLRUTest = new LRUTest<>(2);
        stringStringLRUTest.put("s1","s");
        stringStringLRUTest.put("s2","s2");
        stringStringLRUTest.put("s3","s3");
       stringStringLRUTest.forEach((K,V)-> System.out.println(K+"&&"+V));

    }

    @Test
    public void test(){

    }

}




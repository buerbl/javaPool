package 常见排序算法.练习;

import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/18 12:36
 */
public class SelectSort extends BaseSort {
    @Override
    protected void sort(int[] arr) {

    }

    @Test
    public void test(){
        BaseSort sort = new SelectSort();
        sort.testSort(sort);
    }
}




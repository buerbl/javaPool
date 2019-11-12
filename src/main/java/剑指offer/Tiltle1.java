package 剑指offer;

import org.junit.Test;
import sun.plugin.javascript.navig.Array;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

/**
 * @Description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到
 * 下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author: boolean
 * @Date: 2019/11/10 12:17
 */
public class Tiltle1 {
    public boolean Find(int target, int [][] array) {
        int j = array[0].length - 1;
        int i = 0;
        for ( i = 0 ;i < array.length && j >= 0;){
            if (array[i][j] > target){
                --j;
            }else if (array[i][j] < target){
                ++i;
            }else {
                System.out.println("找到了：" + array[i][j]);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }


}




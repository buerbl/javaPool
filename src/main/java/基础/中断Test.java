package 基础;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:  return break continue 测试
 * return 结束函数
 * break 结束一个循环体
 * continue 结束一个循环体里面的一次循环
 * @Author: boolean
 * @Date: 2019/11/22 14:16
 */
@Slf4j
public class 中断Test {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                log.info("ee");
                if (j == 0){
                    return;
                }
                log.info("if外的函数");
            }
        }

        log.info("最后的测试");
    }
}




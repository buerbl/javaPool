package 枚举类的使用;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author boolean
 * Date: 2019/9/29 14:37
 * description:
 */

@Getter
@AllArgsConstructor
public enum StatusEnum {
    ONLINE(1, "上线"),
    OFFLINE(2, "下线");

    private Integer code;
    private String msg;
}

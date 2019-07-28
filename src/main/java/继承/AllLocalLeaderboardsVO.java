package 继承;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllLocalLeaderboardsVO {

    /**
     * 排名
     */
    private Long ranking;

    private Long userId;

    private String userName;

    private String userIMG;

    /**
     * 当天最大的金豆数
     */
    private Integer maxGoldBean;
}

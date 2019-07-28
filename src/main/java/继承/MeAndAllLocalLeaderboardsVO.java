package 继承;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeAndAllLocalLeaderboardsVO extends AllLocalLeaderboardsVO{

    /**
     * 土豪榜的top榜数据
     */
    private List<AllLocalLeaderboardsVO> allLocalLeaderboardsVOList;
}

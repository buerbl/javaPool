package 继承;

import com.google.gson.Gson;

public class Test {
    @org.junit.Test
    public void test(){
        MeAndAllLocalLeaderboardsVO meAndAllLocalLeaderboardsVO = new MeAndAllLocalLeaderboardsVO();
        AllLocalLeaderboardsVO allLocalLeaderboardsVO = new AllLocalLeaderboardsVO();

        allLocalLeaderboardsVO.setRanking(1L);
        System.out.println(new Gson().toJson(allLocalLeaderboardsVO));
        meAndAllLocalLeaderboardsVO.setUserId(1L);
        meAndAllLocalLeaderboardsVO.setRanking(1L);
        System.out.println(new Gson().toJson(meAndAllLocalLeaderboardsVO));
    }
}

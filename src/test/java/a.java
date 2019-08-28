import java.util.List;

/**
 * @Auther: boolean
 * @Date: 2019/4/15 00:34
 * @Description:
 */
public class a {
//    @Test
//    public static void runable(){
//        new Thread(() -> System.out.println("it is A lambda")).start();
//    }
//    public static void main(String[] args) {
//        runable();
//    }


    public void test2() {
        List a;
//        System.out.println(A.toString());
    }

    public Double getScore( Long oneDayGoldBean, Long useTime) {
        String value1 = String.valueOf(oneDayGoldBean/1.0);
        long todayEndSS = getTodayEndSS(useTime);
        String value2 = String.valueOf(todayEndSS);
        String score =value1+value2;
        return -Double.valueOf(score);
    }

    private long getTodayEndSS(long current){
        //今天零点零分零秒的毫秒数
        long zero = 0L;
        //今天23点59分59秒的毫秒数
        long twelve = zero + 24 * 60 * 60 * 1000;
        return (twelve - current) / 1000;
    }
}



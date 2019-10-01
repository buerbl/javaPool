package 异常;

public class Test {

    public static void main(String[] args)  {
//        Boolean a = true;
//        if (a){
////            throw new MyException();
//
//        }else {
//            throw new MyPlusException();
//        }

        try {
//            orderLogMapper.insertLog(orderLog);
        } catch (Exception e) {
            System.out.println("sdad");

            throw new RuntimeException(e);
//            map.put("code", "1002");
//            map.put("msg", "创建订单日志异常");
//            return map;
        }

    }

    private String throwTest(){
        try {
//            orderLogMapper.insertLog(orderLog);
        } catch (Exception e) {
            throw new RuntimeException(e);
//            map.put("code", "1002");
//            map.put("msg", "创建订单日志异常");
//            return "dd";
        }
        return "d";
    }

}

package 输入与输出;

import java.sql.*;

/**
 * @Description: JDBC 连接测试
 * @Author: boolean
 * @Date: 2019/12/15 10:34
 */
public class DbUtil {
    public static final String URL = "jdbc:mysql://47.105.202.146:3306/dev";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        //sql
//        String sql = "INSERT INTO test(name)"
//                +"values(?)";
//        //预编译
//        PreparedStatement ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行
//
//        //传参
//        ptmt.setString(1, "\uD83D\uDE43");
//        System.out.println(ptmt.toString());//此处打印了对象和 带入参数后的sql语句
//
//
//        //执行
//        if (ptmt.execute()) {
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name FROM test");
        //如果有数据，rs.next()返回true
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
    }
}




package The_property_management.database;

import java.sql.Connection;
import java.sql.DriverManager;

//连接数据库
public class dome {
    private String dbUrl = "jdbc:mysql://localhost:3306/java";  //数据库的链接地址
    private String dbUserName = "root";    //数据库的用户名
    private String dbPassword = "123456";  //密码
    private String jdbcName = "com.mysql.jdbc.Driver";   //驱动软件

    //数据库连接
    public Connection getCon() throws Exception {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    //数据库关闭
    public void closeCon(Connection con) throws Exception {
        if (con != null) {
            con.close();
        }
    }

    //设置数据是否连接
    public static void main(String[] args) {
        dome dbUtil = new dome();
        try {
            dbUtil.getCon();
            System.out.println("数据库链接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

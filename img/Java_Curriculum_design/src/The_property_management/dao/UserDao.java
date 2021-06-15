package The_property_management.dao;

import The_property_management.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//用户访问数据库
public class UserDao {
    //登陆验证
    public User login(Connection con, User user) throws Exception{
        User resultUser = null;
        String sql = "select * from adm where name=?andpossword=?";  //查找数据库的接口
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,user.getUserName());
        pstmt.setString(2, user.getPassWord());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            resultUser = new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUserName(rs.getString ("userName"));
            resultUser.setPassWord(rs.getString ("passWord"));
        }
        return resultUser;
    }
}

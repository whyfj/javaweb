package com.kuang.lesson02;

import com.kuang.lesson02.utils.JdbcUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class TestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try{
//获取一个数据库连接
            conn = JdbcUtils.getConnection();
//通过conn对象获取负责执行SQL命令的Statement对象
            st = conn.createStatement();
//要执行的SQL命令
            String sql = "insert into users(id,name,password,email,birthday) " +
                    "values(5,'kuangshen','123','24736743@qq.com','2019-10-17 22:17:26')";
//执行插入操作，executeUpdate方法返回成功的条数
            int num = st.executeUpdate(sql);
            if(num>0){
                System.out.println("插入成功！！");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
//SQL执行完成之后释放相关资源
            JdbcUtils.release(conn, st, rs);
        }
    }
}

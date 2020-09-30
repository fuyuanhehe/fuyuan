package kite.springcloud.oauth2.authserver.controller;

import org.springframework.jdbc.core.metadata.OracleCallMetaDataProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

/**
 * 使用datasource方法建立mysql数据库连接。
 * @author bestree007;
 *
 */
public class MYSQLConnection {
    public static void main(String[] args) {
        com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds;
        Connection conn2;
        // create connection with a datasource object
        ds = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
        ds.setServerName("localhost");
        ds.setDatabaseName("test");
        ds.setPort(3306);
        // ds.setURL("jdbc:mysql://localhost:3306/bestree");
        try {
            conn2 = ds.getConnection("root", "123456");
            if (!conn2.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");
            }
            Statement statement = conn2.createStatement();
            String sql = "select * from sys_user";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("username");
                System.out.println(name);
            }
            rs.close();
            conn2.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

package kite.springcloud.oauth2.authserver.controller;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * HelloController
 *
 * @author fengzheng
 * @date 2019/10/18
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args){

        System.out.println(new BCryptPasswordEncoder().encode("user-secret-8888"));
        System.out.println(new BCryptPasswordEncoder().encode("client-secret-8888"));
        System.out.println(new BCryptPasswordEncoder().encode("code-secret-8888"));
    }


    @RequestMapping(value = "test")
    public void test() throws SQLException {

        Connection con = dataSource.getConnection();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from system_user ");
        while (rs.next()) {
            String name = rs.getString("username");
            System.out.println(name);
        }

    }


}

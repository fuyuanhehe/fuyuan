package kite.springcloud.oauth.client.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 * @author  故事的风筝
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Authorization: Basic user-client:user-secret-8888
    // 获取token    user-client   user-secret-8888
//http://localhost:6001/oauth/token?grant_type=password&username=admin&password=123456&scope=all

    // 查看信息
    //http://localhost:6101/client-user/get
    // Authorization: bearer : token

//http://localhost:6101/client-user/jwt


    //更换token   username: user-client ,  password: user-secret-8888
  //  Authorization: Basic dXNlci1jbGllbnQ6dXNlci1zZWNyZXQtODg4OA==
    // http://localhost:6001/oauth/token?grant_type=refresh_token&refresh_token= {refresh_token}

}

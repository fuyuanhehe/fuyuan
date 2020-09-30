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
//http://localhost:6101/client-user/jwt


    //更换token
    // Authorization: bearer token
    // http://localhost:6001/oauth/token?
    // grant_type=refresh_token&refresh_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsImp3dC1leHQiOiJKV1Qg5omp5bGV5L-h5oGvIiwic2NvcGUiOlsiYWxsIl0sImF0aSI6ImU0ZmIwM2M1LTc3YjUtNDI1Yi1iM2Y2LWNmMWIxNzhiMTVmYyIsImV4cCI6MTYwMTQwNjk4MCwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiI1MmNkZjAzMC1lMjE1LTRkNTMtOWE4MS0wZTgyMGVjODBlNzQiLCJjbGllbnRfaWQiOiJ1c2VyLWNsaWVudCJ9.-4gVxDF9-_cXCYewxtrF2-W792WVv6kLpE62ZyzyBgc

}

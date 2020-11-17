package kite.springcloud.oauth.client.user.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

/**
 * OrderController
 *
 * @author fengzheng
 * @date 2019/10/11
 */
@Slf4j
@RestController
public class UserController {

   // @PreAuthorize(value="isAuthenticated()")//添加登录权限判断，登录才可以调用
 //  @PreAuthorize(value = "#oauth2.hasAnyScope('A','B','C','D')")//添加机构编码权限，判断该机构是否有权限调用
    @GetMapping(value = "get")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    //   @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    //   @PreAuthorize("hasRole('ROLE_ADMIN')")
    //    * 限制只能查询自己的信息
    //   @PreAuthorize("principal.username.equals(#username)")
  //  @PostAuthorize("returnObject.id%2==0") 如果返回值的id是偶数则表示校验通过
   // @PostFilter("filterObject.id%2==0"） 上述代码表示将对返回结果中id不为偶数的user进行移除
    //  @PreFilter(filterTarget="ids", value="filterObject%2==0")
    public Object get(Authentication authentication){
        //Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.getCredentials();
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)authentication.getDetails();
        String token = details.getTokenValue();
        return token;
    }

    @GetMapping(value = "jwt")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public Object jwtParser(Authentication authentication){
        authentication.getCredentials();
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)authentication.getDetails();
        String jwtToken = details.getTokenValue();
        Claims claims = Jwts.parser()
                .setSigningKey("dev".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(jwtToken)
                .getBody();
        return claims;
    }
}

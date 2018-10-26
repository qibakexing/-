package com.qfedu.suning_e_commerce.shiro;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

/**
 */
@Configuration
public class ShiroConfig {


    @Bean
    public DefaultWebSecurityManager createManager(UserRealm userRealm){
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager(userRealm);
        return manager;
    }
    @Bean
    public ShiroFilterFactoryBean createFb(WebSecurityManager manager){
        ShiroFilterFactoryBean filterFactoryBean=new ShiroFilterFactoryBean();
        filterFactoryBean.setSecurityManager(manager);
        filterFactoryBean.setLoginUrl("login.html");
        filterFactoryBean.setSuccessUrl("index.html");
        filterFactoryBean.setUnauthorizedUrl("error.html");
        Map<String,String> map=new HashMap<>();
        map.put("/login.html","anon");
        map.put("/userlogin.do","anon");
        map.put("/blogstart.do","anon");
        map.put("/media/**","anon");
        map.put("/**","authc");
        filterFactoryBean.setFilterChainDefinitionMap(map);

        return filterFactoryBean;
    }
    @Bean
    public AuthorizationAttributeSourceAdvisor createAdvisor(DefaultWebSecurityManager manager){
        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(manager);
        return advisor;
    }

}

package cn.heweiming.ssj.config;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * @author heweiming  2017年9月23日 下午5:15:51
 * @version 1.0.0
 * @description 
 */
public class ServletConfig {

    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter filter = new WebStatFilter();
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filter);
        Map<String, String> initParameters = new LinkedHashMap<>();
        initParameters.put("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registration.setInitParameters(initParameters);
        registration.setUrlPatterns(Collections.singleton("/*"));
        return registration;
    }

    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet servlet = new StatViewServlet();
        ServletRegistrationBean registration = new ServletRegistrationBean();
        registration.setServlet(servlet);
        registration.setUrlMappings(Collections.singleton("/druid/*"));
        return registration;
    }

}

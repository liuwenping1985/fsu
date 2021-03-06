package com.cinand.config.database;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.cinand.config.condition.LicenseCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据源配置
 * Created by liuwenping on 2021/6/24.
 */
@Configuration
@PropertySource("classpath:${spring.profiles.active}/datasource.properties")
@ConfigurationProperties(prefix = "datasource")
@Conditional(LicenseCondition.class)
public class FsuDataSource {

    private static final Logger log = LoggerFactory.getLogger(FsuDataSource.class);

    @Value("${druid.login.user_name}")
    private String userName;

    @Value("${druid.login.password}")
    private String password;

    @Value("${druid.allow.ip}")
    private String allowIp;

    /**
     * 私有bean,现在用durid数据源
     * @return
     */
    @Primary
    @Bean(name="primary_data_source")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean druidServlet() {
        log.info("init Druid Servlet Configuration ");
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<>();
        initParameters.put("loginUsername", userName);
        initParameters.put("loginPassword", password);
        // 禁用HTML页面上的“Reset All”功能
        initParameters.put("resetEnable", "false");
        //initParameters.put("allow", allowIp); // IP白名单 (没有配置或者为空，则允许所有访问)
        //initParameters.put("deny", "");// IP黑名单 (存在共同时，deny优先于allow)
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.jpeg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }


}

package cn.heweiming.ssj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import cn.heweiming.ssj.constant.ConfigConstant;

/**
 * @author heweiming 2017年9月23日 下午5:15:59
 * @version 1.0.0
 * @description
 */
@Configuration
@Import(value = { DataSourceConfig.class, JPAConfig.class, RestTemplateConfig.class, AsyncConfig.class,
		CacheConfig.class })
@ComponentScan(basePackages = { ConfigConstant.SCAN_BASE_PACKAGES }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class),
		@Filter(type = FilterType.ANNOTATION, value = Controller.class),
		@Filter(type = FilterType.ANNOTATION, value = RestController.class),
		@Filter(type = FilterType.ANNOTATION, value = ControllerAdvice.class) })
@EnableAspectJAutoProxy
public class SpringContextConfig {

}

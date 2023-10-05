package com.te.myconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.te")
@EnableWebMvc
public class AnnotationBasedDispatcherServlet {

	public LocalEntityManagerFactoryBean getFactory() {
		LocalEntityManagerFactoryBean beanFactory = new LocalEntityManagerFactoryBean();
		beanFactory.setPersistenceUnitName("players");
		return beanFactory;
	}

}

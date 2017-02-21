package de.requalize;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zkoss.zk.au.http.DHtmlUpdateServlet;
import org.zkoss.zk.ui.http.DHtmlLayoutServlet;

@SpringBootApplication
public class RequalizeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequalizeWebApplication.class, args);
	}
	
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hi!";
	}
	
	@Bean
	public ServletRegistrationBean<DHtmlLayoutServlet> dHtmlLayoutServlet() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("update-uri", "/zkau");
		DHtmlLayoutServlet dHtmlLayoutServlet = new DHtmlLayoutServlet();
		ServletRegistrationBean<DHtmlLayoutServlet> reg = new ServletRegistrationBean<DHtmlLayoutServlet>(dHtmlLayoutServlet, "*.zul");
		reg.setLoadOnStartup(1);
		reg.setInitParameters(params);
		return reg;
	}

	@Bean
	public ServletRegistrationBean<DHtmlUpdateServlet> dHtmlUpdateServlet() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("update-uri", "/zkau/*");
		ServletRegistrationBean<DHtmlUpdateServlet> reg = new ServletRegistrationBean<DHtmlUpdateServlet>(new DHtmlUpdateServlet(), "/zkau/*");
		reg.setLoadOnStartup(2);
		reg.setInitParameters(params);
		return reg;
	}
//	
//	@Bean
//	public HttpSessionListener httpSessionListener() {
//		return new HttpSessionListener();
//	}
}

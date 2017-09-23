
package com.starter.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@EnableAutoConfiguration
/**
 * @author Sudheer Yallamreddy
 * java-recent.blogspot.com
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.*")
public class SpringStarter extends SpringBootServletInitializer {

	/**
	 * @param args
	 */
	/* @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringStarter.class);
	    }*/
	public static void main(String[] args)  {
		System.out.println("starting my spring application");
		SpringApplication.run(SpringStarter.class, args);
		try {
		InetAddress ipAddress = InetAddress.getLocalHost();
		System.out.println("IP of my system is := "+ipAddress.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Bean
	public Docket simpleDiffServiceApi() {
	  return new Docket(DocumentationType.SWAGGER_2)
	  .groupName("My REST services")
	  .apiInfo(apiInfo())
	  .select()
	  .apis(RequestHandlerSelectors.any())
	  .paths(PathSelectors.any())
	  .build()
	  .pathMapping("/");
	 
	
}

	private ApiInfo apiInfo() {
		 return new ApiInfoBuilder()
		  .title("My Application REST services")
		  .description("Lists out all the  rest services in my application")
		  .contact(new Contact("Sudheer yallamreddy", "java-recent.blogspot.com", "sudheerreddy55@gmail.com"))
		  .version("1.0")
		  .build();
	}
	
}

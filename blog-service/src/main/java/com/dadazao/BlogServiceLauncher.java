package com.dadazao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author John Li
 */
@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
public class BlogServiceLauncher {
    public static void main(String[] args) {
        SpringApplication.run(BlogServiceLauncher.class, args);
    }

    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dadazao"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder()
                .title("Start restfulAPI Demo")
                .description("springboot swagger2")
                .termsOfServiceUrl("https://github.com/jujube-framework")
                .contact(new Contact(
                        "John Li",
                        "https://github.com/jujube-framework",
                        "jujubeframework@163.com"))
                .version("1.0")
                .build();
    }
}


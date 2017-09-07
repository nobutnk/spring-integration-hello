/**
 * 
 */
package com.nobutnk.springintegration.example.mian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobutnk.springintegration.example.service.GreeterService;

/**
 * @author nobutnk
 *
 */
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/applicationContext.xml");

        GreeterService greeterService = applicationContext
                .getBean("greeterServiceImpl", GreeterService.class);

        greeterService.greet("Spring Integration!");

        applicationContext.close();

    }

}

/**
 * 
 */
package com.nobutnk.springintegration.example.mian;

import java.util.Random;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobutnk.springintegration.example.service.cafe.Customer;

/**
 * @author nobutnk
 *
 */
public class AppQueue {

    static Logger logger = Logger.getLogger(AppQueue.class.getName());
    private final static String SPRING_CONTEXT_FILE = "classpath:META-INF/spring/applicationContext-queue.xml";

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(SPRING_CONTEXT_FILE);
        Customer customer = (Customer) applicationContext.getBean("customer");
        repeatedlyPlaceCustomerOrders(customer);
        
        applicationContext.close();
    }

    private static void repeatedlyPlaceCustomerOrders(Customer customer) throws InterruptedException {
        Random random = new Random();
        while (true) {
            customer.placeOrder();
            Thread.sleep(random.nextInt(10) * 1000L);
        }
    }

}

/**
 * 
 */
package com.nobutnk.springintegration.example.service;

import org.springframework.stereotype.Service;

/**
 * @author nobutnk
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

    /** 
     * "Hello" + name
     * @see com.nobutnk.springintegration.example.service.HelloService#hello(java.lang.String)
     */
    public void hello(String name) {
        System.out.println( "Hello, " + name );
    }

}

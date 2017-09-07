/**
 * 
 */
package com.nobutnk.springintegration.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * @author nobutnk
 *
 */
@Service
public class GreeterServiceImpl implements GreeterService {

    @Autowired
    private MessageChannel helloWorldChannel;

    public void greet(String name) {
        helloWorldChannel.send(MessageBuilder.withPayload(name).build());
    }

}

package com.nobutnk.springintegration.example.service.cafe;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

public class Barista {

    Logger logger = Logger.getLogger(Barista.class.getName());
    private ThreadPoolExecutor executorService;
    private String name;

    public Barista(String name, ThreadPoolExecutor executorService) {
        this.name = name;
        this.executorService = executorService;
    }

    public void makeCoffee(Object request) {
        executorService.execute(() -> {
            logger.info(String.format("%s making coffee order [%s]", name, request.toString()));
        });
    }
}

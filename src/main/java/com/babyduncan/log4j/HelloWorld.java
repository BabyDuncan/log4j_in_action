package com.babyduncan.log4j;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-10-21 15:16
 */

import org.apache.log4j.*;

/**
 * log one message use log4j
 */
public class HelloWorld {

    private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String... args) {
        //you must config first ,or there will be log4j:WARN No appenders could be found for logger
        // (com.babyduncan.log4j.HelloWorld).
        BasicConfigurator.configure();
        logger.info("Hello World!");
        logger.error("An error occur!");
    }

}

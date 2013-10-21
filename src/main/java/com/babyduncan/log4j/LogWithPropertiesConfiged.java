package com.babyduncan.log4j;

import org.apache.log4j.Logger;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-10-21 23:31
 */
public class LogWithPropertiesConfiged {

    private static final Logger logger = Logger.getLogger(LogWithPropertiesConfiged.class);

    public static void main(String... args) {
        // it will auto find log4j.properties(or log4j.xml) from classpath
//        PropertyConfigurator.configure(log4j.properties);
        logger.info("test !!");
    }
}

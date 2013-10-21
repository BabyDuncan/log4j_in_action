package com.babyduncan.log4j;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-10-21 15:27
 */
public class TestSameLogger {

    @Test
    public void sameLogger() {
        Logger logger1 = Logger.getLogger("aaa");
        Logger logger2 = Logger.getLogger("aaa");
//      exact equals
        Assert.assertEquals(logger1, logger2);
        Assert.assertTrue(logger1 == logger2);
    }

}

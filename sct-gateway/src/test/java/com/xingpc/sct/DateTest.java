package com.xingpc.sct;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.ZonedDateTime;

/**
 * @Author: XingPc
 * @Description: 日期测试类
 * @Date: 2020/5/15 9:07
 * @Version: 1.0
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class DateTest {

    @Test
    public void testDate() {
        ZonedDateTime dateTime = ZonedDateTime.now();
        log.info("" + dateTime);
        Assert.assertNotNull(dateTime);
    }

}

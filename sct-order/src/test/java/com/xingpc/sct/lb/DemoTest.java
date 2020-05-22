package com.xingpc.sct.lb;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XingPc
 * @Description: 测试类
 * @Date: 2020/5/10 18:38
 * @Version: 1.0
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class DemoTest {

    @Test
    public void getIntegerMaxValue() {
      log.info(Integer.MAX_VALUE + "");
        List<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.forEach(str-> { log.info(str);});
    }

}

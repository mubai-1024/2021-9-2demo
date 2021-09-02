package com.bankofwuhai.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DataSourceTest {

    @Resource
    private DataSource dataSource;


    @Test
    public void connectionTest(){
        System.out.println("数据库连接:"+dataSource);
    }
}

package com.edu.datasouce;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataSouceMainTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate db1JdbcTemplate;
    @Autowired
    private JdbcTemplate db2JdbcTemplate;

    @Test
    public void testContextLoad(){

    }

    @Test
    public void testAddData() throws Exception{
        jdbcTemplate.execute("insert into test_user(name, password) values('张三', 18)");
    }

    @Test
    public void testMutiDataSouce(){
        System.out.println(db1JdbcTemplate);
        db1JdbcTemplate.execute("insert into test_user(name, password) values('张三1', 18)");
        System.out.println(db2JdbcTemplate);
        db2JdbcTemplate.execute("insert into test_user(name, password) values('张三2', 18)");

    }
}

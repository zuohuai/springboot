package com.edu.datasouce;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.db1")
    public DataSourceProperties db1DataSourceProperties() {
        return new DataSourceProperties();
    }


    @Bean
    @Primary
    public DataSource db1DataSouce(){
        return db1DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name="db1JdbcTemplate")
    @Primary
    JdbcTemplate db1JdbcTemplate(){
      return new JdbcTemplate(db1DataSouce());
    }

    @Bean
    @ConfigurationProperties("app.datasource.db2")
    public DataSourceProperties db2DataSourceProperties() {
        return new DataSourceProperties();
    }


    @Bean
    public DataSource db2DataSouce(){
        return db2DataSourceProperties().initializeDataSourceBuilder().build();
    }


    @Bean(name="db2JdbcTemplate")
    JdbcTemplate db2JdbcTemplate(){
        return new JdbcTemplate(db2DataSouce());
    }
}

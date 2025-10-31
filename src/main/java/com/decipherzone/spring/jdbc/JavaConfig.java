// INSTEAD OF     "config.xml file"         WE  USE THIS CLASS FOR CONFIGURATION
// and removed config.xml file


package com.decipherzone.spring.jdbc;

import com.decipherzone.spring.dao.StudentDaoChild;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration                                   // this tells IOC container that all configuration is in this class
public class JavaConfig {

    //DECLARING BEAN AS METHOD

    @Bean("ds")                                  // bean for dataSource
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/Spring-db");
        ds.setUsername("postgres");
        ds.setPassword("Dkdinesh6229");
        return ds;
    }
    @Bean("jdbcTemplate")                        // bean for jdbcTemplate
    public JdbcTemplate getTemplate(){
          JdbcTemplate jdbcTemplate = new JdbcTemplate();
          jdbcTemplate.setDataSource(getDataSource());
          return jdbcTemplate;
    }
    @Bean("child")                               // bean for StudentDaoChild in which we implemented StudentDao interface
    public StudentDaoChild getStudentDao(){
        StudentDaoChild child = new StudentDaoChild();
        child.setJdbcTemplate(getTemplate());
        return child;
    }


}

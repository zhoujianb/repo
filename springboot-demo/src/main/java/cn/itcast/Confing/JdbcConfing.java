package cn.itcast.Confing;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

//@Configuration
//@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfing {
    //@Value("${jdbc.url}")
     //String  url;
   // @Value("${jdbc.driverClassName}")
     //String  driverClassName;
    //@Value("${jdbc.username}")
 // String  username;
     //@Value("${jdbc.password}")
   //  String  passwrod;


   // @Bean
    //@ConfigurationProperties(prefix = "jdbc")
    //public DataSource dateSouce() {
        //  DruidDataSource  dataSource= new DruidDataSource();

        //dataSource.setDriverClassName(prop.driverClassName);
        //dataSource.setUrl(prop.url);
        //dataSource.setUsername(prop.username);
        //dataSource.setPassword(prop.passwrod);
        //return dataSource;

      //  return new DruidDataSource();
    //}

}

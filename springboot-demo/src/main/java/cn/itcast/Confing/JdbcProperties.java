package cn.itcast.Confing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {

    String  url;
    String  driverClassName;
    String  username;
    String  passwrod;




}

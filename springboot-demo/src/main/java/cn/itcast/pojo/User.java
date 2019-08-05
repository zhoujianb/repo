package cn.itcast.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.naming.Name;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
@Data
@Table(name = "tb_user")
public class User {
     //id
    @Id
    @KeySql(useGeneratedKeys = true)
    private  long  id;
   //用户名
     private  String   username;
     //密码
     private  String    password;
    // 姓名
      private   String   name;
     //性别 1男 2女
      private  Integer   sex;
      //年龄
       private  Integer  age;
     //出生日期
       private Date   birthday;
      //创建时间
       private  Date   created;
       //更新时间
       private  Date  update;
      //备注
      @Transient
       private  String  noth;





}

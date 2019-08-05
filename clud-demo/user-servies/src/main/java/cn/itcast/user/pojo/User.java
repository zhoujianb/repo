package cn.itcast.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.naming.Name;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
//@Data
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
    private Date update;
    //备注
    @Transient
    private  String  noth;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public String getNoth() {
        return noth;
    }

    public void setNoth(String noth) {
        this.noth = noth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", birthday=" + birthday +
                ", created=" + created +
                ", update=" + update +
                ", noth='" + noth + '\'' +
                '}';
    }
}

package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.servies.UserServies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
@Slf4j
@RestController
@RequestMapping("user")
public class HelloController {
  //  @Autowired
  //  private DataSource  dateSource;
     @Autowired
     private UserServies  userServies;
     @GetMapping("{id}")
     @ResponseBody
    public User Hello(@PathVariable("id")Long id) {
    //   log.debug("hello");

         return userServies.queryByid(id);

    }


}

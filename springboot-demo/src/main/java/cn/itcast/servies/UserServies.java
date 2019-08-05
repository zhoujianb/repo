package cn.itcast.servies;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServies {

   @Autowired
    private UserMapper  userMapper;

   public User  queryByid(Long id){


       return userMapper.selectByPrimaryKey(id);
   }
    @Transactional
      public int insertUser(User  user){

      return  userMapper.insert(user);

      }

}

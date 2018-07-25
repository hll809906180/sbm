package com.dream.sbm.usermanager.service;

import com.dream.sbm.usermanager.dao.UserMapper;
import com.dream.sbm.usermanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Boolean userLogin(User user){
        User us =  userMapper.userLogin(user);
        if(us==null){
            return false;
        }else{
            return  true;
        }
    }
}

package com.dream.sbm.usermanager.dao;

import com.dream.sbm.usermanager.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User userLogin(User user);
}

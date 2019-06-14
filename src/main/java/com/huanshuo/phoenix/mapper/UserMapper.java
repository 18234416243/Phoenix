package com.huanshuo.phoenix.mapper;

import com.huanshuo.phoenix.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserMapper {

    List<User> selectAll();

}

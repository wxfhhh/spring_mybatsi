package com.spring_mybatsi.mapper;

import com.spring_mybatsi.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Insert("insert into user (username,pwd) values(#{userName},#{pwd})")
    int save(User user);
}
